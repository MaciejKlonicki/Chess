package com.company;


import com.company.Pieces.Knight;

import javax.swing.*;
import java.awt.*;


public class GamePanel  extends JFrame {

    //buttons to place all over the screen
    public final JButton [][] chessBoardButtons = new JButton[8][8];
    int b_knight_row = 7;
    int b_knight_col = 1;
    int b_knight_row2 = 7;
    int b_knight_col2 = 6;

    GamePanel () {
        Knight knight1 = new Knight(chessBoardButtons);
        Knight knight2 = new Knight(chessBoardButtons);

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
                chessBoardButtons[i][j].addMouseListener(knight1);
                chessBoardButtons[i][j].addMouseListener(knight2);
            }
        }
        int w_knight_row = 0;
        int w_knight_col = 1;
        ImageIcon w_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[w_knight_row][w_knight_col].setIcon(w_knightIcon);

        int w_knight_row2 = 0;
        int w_knight_col2 = 6;
        ImageIcon w_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[w_knight_row2][w_knight_col2].setIcon(w_knightIcon2);

        ImageIcon b_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[b_knight_row][b_knight_col].setIcon(b_knightIcon);

        ImageIcon b_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[b_knight_row2][b_knight_col2].setIcon(b_knightIcon2);

        setSize(800,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


