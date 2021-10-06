package com.company;


import javax.swing.*;
import java.awt.*;


public class GamePanel  extends JFrame {

    //buttons to place all over the screen
    public final JButton [][] chessBoardButtons = new JButton[8][8];

    public GamePanel () {
        Knight knight = new Knight(chessBoardButtons);
        Container container = getContentPane();
        container.setLayout(new GridLayout(8,8));

        // Chessboard
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j ++ ) {
                chessBoardButtons[i][j] = new JButton();
                if ((i+j)%2 !=0) {
                    chessBoardButtons[i][j].setBackground(new Color(50,100,100));
                }
                container.add(chessBoardButtons[i][j]);
                chessBoardButtons[i][j].addActionListener(knight);
            }
        }
        int row = 7;
        int col = 1;
        ImageIcon knightIcon = new ImageIcon("knight.png");
        chessBoardButtons[row][col].setIcon(knightIcon);

        setSize(800,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


