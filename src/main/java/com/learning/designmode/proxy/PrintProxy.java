package com.learning.designmode.proxy;

public class PrintProxy implements Printable{

    private Printer printer;
    private String name;

    @Override
    public void setPrinterName(String name) {
        this.name = name;
        if (printer != null) {
            printer.setPrinterName(name);
        }
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        if (printer == null) {
            realize();
        }
        printer.print(string);
    }

    private void realize() {
        if (printer == null) {
            printer = new Printer(name);
        }
    }
}
