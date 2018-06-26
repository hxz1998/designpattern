package com.learning.designmode.proxy;

public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob();
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }

    private void heavyJob() {
        System.out.println("Printer实例正在生成中");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(".");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生成完成！");
    }
}
