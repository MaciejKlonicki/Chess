package com.company;


import com.company.Pieces.GameConfig;

import javax.swing.*;
import java.awt.*;


public class GamePanel  extends JFrame {

    //buttons to place all over the screen
    public final JButton [][] chessBoardButtons = new JButton[8][8];
    int b_knight_row = 7;
    int b_knight_col = 1;
    int b_knight_row2 = 7;
    int b_knight_col2 = 6;
    int w_knight_row2 = 0;
    int w_knight_col2 = 6;
    int w_knight_row = 0;
    int w_knight_col = 1;
    int b_tower_row = 7;
    int b_tower_col = 0;
    int b_tower_row2 = 7;
    int b_tower_col2 = 7;
    int w_tower_row = 0;
    int w_tower_col = 0;
    int w_tower_row2 = 0;
    int w_tower_col2 = 7;
    int b_bishop_row = 7;
    int b_bishop_col = 2;
    int b_bishop_row2 = 7;
    int b_bishop_col2 = 5;
    int w_bishop_row = 0;
    int w_bishop_col = 2;
    int w_bishop_row2 = 0;
    int w_bishop_col2 = 5;
    int b_queen_row = 7;
    int b_queen_col = 3;
    int w_queen_row = 0;
    int w_queen_col = 3;
    int b_king_row = 7;
    int b_king_col = 4;
    int w_king_row = 0;
    int w_king_col = 4;
    int w_pawn_row = 1;
    int b_pawn_row = 6;

    GamePanel () {
        GameConfig gameConfig = new GameConfig(chessBoardButtons);

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
                chessBoardButtons[i][j].addMouseListener(gameConfig);
            }
        }

        // pawns white
        for (int x = 0; x < 8 ; x ++){
            ImageIcon w_pawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
            chessBoardButtons[w_pawn_row][x].setIcon(w_pawnIcon);
        }

        // pawns black
        for (int x = 0; x < 8 ; x ++){
            ImageIcon b_pawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
            chessBoardButtons[b_pawn_row][x].setIcon(b_pawnIcon);
        }

        //icons for each figure
        ImageIcon w_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[w_knight_row][w_knight_col].setIcon(w_knightIcon);

        ImageIcon w_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[w_knight_row2][w_knight_col2].setIcon(w_knightIcon2);

        ImageIcon b_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[b_knight_row][b_knight_col].setIcon(b_knightIcon);

        ImageIcon b_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[b_knight_row2][b_knight_col2].setIcon(b_knightIcon2);

        ImageIcon b_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
        chessBoardButtons[b_tower_row][b_tower_col].setIcon(b_towerIcon);

        ImageIcon b_towerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
        chessBoardButtons[b_tower_row2][b_tower_col2].setIcon(b_towerIcon2);

        ImageIcon w_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
        chessBoardButtons[w_tower_row][w_tower_col].setIcon(w_towerIcon);

        ImageIcon w_towerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
        chessBoardButtons[w_tower_row2][w_tower_col2].setIcon(w_towerIcon2);

        ImageIcon b_bishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
        chessBoardButtons[b_bishop_row][b_bishop_col].setIcon(b_bishopIcon);

        ImageIcon b_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
        chessBoardButtons[b_bishop_row2][b_bishop_col2].setIcon(b_bishopIcon2);

        ImageIcon w_bishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
        chessBoardButtons[w_bishop_row][w_bishop_col].setIcon(w_bishopIcon);

        ImageIcon w_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
        chessBoardButtons[w_bishop_row2][w_bishop_col2].setIcon(w_bishopIcon2);

        ImageIcon b_queenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen.png");
        chessBoardButtons[b_queen_row][b_queen_col].setIcon(b_queenIcon);

        ImageIcon w_queenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen_w.png");
        chessBoardButtons[w_queen_row][w_queen_col].setIcon(w_queenIcon);

        ImageIcon b_kingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king.png");
        chessBoardButtons[b_king_row][b_king_col].setIcon(b_kingIcon);

        ImageIcon w_kingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king_w.png");
        chessBoardButtons[w_king_row][w_king_col].setIcon(w_kingIcon);

        //window
        setSize(800,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


