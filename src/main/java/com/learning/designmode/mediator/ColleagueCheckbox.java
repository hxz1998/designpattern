package com.learning.designmode.mediator;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends JRadioButton implements Colleague, ItemListener {

    private Mediator mediator;

    public ColleagueCheckbox(String caption,ButtonGroup group, boolean state) {
        super(caption);
        setSelected(state);
        group.add(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
