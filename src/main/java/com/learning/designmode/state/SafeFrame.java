package com.learning.designmode.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context, ActionListener {

    private Button btnUse = new Button("use");
    private Button btnAlarm = new Button("alarm");
    private Button btnPhone = new Button("phone");
    private Button btnExit = new Button("exit");

    private TextField timeLabel = new TextField(60);
    private TextArea msgCenter = new TextArea(10, 60);

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setLayout(new BorderLayout());
        timeLabel.setEditable(false);
        add(timeLabel, BorderLayout.NORTH);
        msgCenter.setVisible(false);
        add(msgCenter, BorderLayout.CENTER);

        Panel panel = new Panel();
        panel.add(btnUse);
        panel.add(btnAlarm);
        panel.add(btnPhone);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        btnUse.addActionListener(this);
        btnAlarm.addActionListener(this);
        btnPhone.addActionListener(this);
        btnExit.addActionListener(this);
    }

    @Override
    public void setClock(int clock) {
        timeLabel.setText("现在时间是：" + clock);
        state.doClock(this, clock);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String message) {
        msgCenter.append(message + "\n");
    }

    @Override
    public void recordLog(String message) {
        msgCenter.append(message + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("666");
        if (e.getSource() == btnUse) {
            state.doUse(this);
        } else if (e.getSource() == btnAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == btnPhone) {
            state.doPhone(this);
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        } else {
            System.out.println("???");
        }
    }
}
