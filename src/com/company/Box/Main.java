package com.company.Box;

import javax.swing.*;
import java.awt.*;

public class Main {

        public static void main(String[] args) {
            JFrame JF = new JFrame();
            JF.setVisible(true);
            JF.setSize(350, 350);
            Line ln = new Line();
            ln.setBackground(Color.green
            );
            JF.add(ln);

        }
    }
