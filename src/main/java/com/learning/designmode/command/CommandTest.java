package com.learning.designmode.command;

import javax.swing.*;
import java.awt.event.*;

public class CommandTest extends JFrame implements ActionListener, MouseMotionListener, MouseListener {

    private MacroCommand commands = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(600, 600, commands);
    private JButton btnClear = new JButton("清除");
    private JButton btnUndo = new JButton("撤销");

    public static void main(String[] args) {
        new CommandTest("我是一个绘图板");
    }

    public CommandTest(String title) {
        super(title);

        canvas.addMouseMotionListener(this);
        canvas.addMouseListener(this);
        btnClear.addActionListener(this);
        btnUndo.addActionListener(this);

        Box btnBox = new Box(BoxLayout.X_AXIS);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        btnBox.add(btnClear);
        btnBox.add(btnUndo);
        mainBox.add(btnBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClear) {
            commands.clear();
            canvas.repaint();
        } else if (e.getSource() == btnUndo) {
            commands.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        commands.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        commands.append(cmd);
        cmd.execute();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
