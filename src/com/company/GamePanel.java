package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GamePanel extends JPanel implements MouseListener {

    private final JButton [][] buttons = new JButton[8][8];


    GamePanel () {
        this.setLayout(new GridLayout(8,8));
        for (int i = 0 ; i < buttons.length ; i++) {
            for (int j = 0 ; j < buttons[i].length ; j ++ ) {
                buttons[i][j] = new JButton();
                this.add(buttons[i][j]);
                if ((j % 2 == 0) == (i % 2 == 0)) {
                    buttons[i][j].setBackground(Color.BLACK);
                } else buttons[i][j].setBackground(Color.WHITE);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == buttons[0]){
            System.out.println("dupa");
        }
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
