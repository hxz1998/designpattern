package com.learning.designmode.mediator;

import javax.swing.*;

public class ColleagueButton extends JButton implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String text) {
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
