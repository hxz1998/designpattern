package com.learning.designmode.mediator;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class ColleagueTextField extends JTextField implements Colleague, DocumentListener {

    private Mediator mediator;

    public ColleagueTextField() {
        setColumns(10);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        setBackground(enable ? Color.blue : Color.green);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        mediator.colleagueChanged();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        mediator.colleagueChanged();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        mediator.colleagueChanged();
    }
}
