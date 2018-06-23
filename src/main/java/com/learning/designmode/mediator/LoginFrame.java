package com.learning.designmode.mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements Mediator, ActionListener {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton btnOk;
    private ColleagueButton btnCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.ORANGE);
        setLayout(new GridLayout(4, 2));
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("User"));
        add(textUser);
        add(new Label("Pass"));
        add(textPass);
        add(btnOk);
        add(btnCancel);

        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        ButtonGroup group = new ButtonGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);
        textUser = new ColleagueTextField();
        textPass = new ColleagueTextField();
        btnOk = new ColleagueButton("ok");
        btnCancel = new ColleagueButton("cancel");

        checkLogin.setMediator(this);
        checkGuest.setMediator(this);
        textPass.setMediator(this);
        textUser.setMediator(this);
        btnOk.setMediator(this);
        btnCancel.setMediator(this);

        checkLogin.addItemListener(checkLogin);
        checkGuest.addItemListener(checkGuest);
        textUser.getDocument().addDocumentListener(textUser);
        textPass.getDocument().addDocumentListener(textPass);
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.isSelected()) {
            textPass.setColleagueEnable(false);
            textUser.setColleagueEnable(false);
            btnOk.setColleagueEnable(true);
        } else {
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        System.exit(0);
    }

    private void userpassChanged() {
        if (textUser.getText().getBytes().length > 0) {
            textPass.setColleagueEnable(true);
            if (textPass.getText().getBytes().length > 0) {
                btnOk.setColleagueEnable(true);
            } else {
                btnOk.setColleagueEnable(false);
            }
        } else {
            textPass.setColleagueEnable(false);
            btnOk.setColleagueEnable(false);
        }
    }
}
