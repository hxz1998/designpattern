package com.learning.designmode.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    private MacroCommand commands;

    public DrawCanvas(int width, int height, MacroCommand macroCommand) {
        this.commands = macroCommand;
        setSize(width, height);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        commands.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.fillOval(x - 3, y - 3, 3 * 2, 3 * 2);
    }
}
