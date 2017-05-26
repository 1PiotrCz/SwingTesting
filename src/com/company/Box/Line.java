package com.company.Box;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Piotr Czubkowski on 2017-05-26.
 */
public class Line extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawLine(0, getHeight(), getWidth(), 0);
    }
}