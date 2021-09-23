package com.company;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
        this.setSize(800,800);
        this.setTitle("CHESS");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
//        this.pack();
        this.setVisible(true);
    }

}
