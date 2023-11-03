package com.company;

import com.company.Pieces.GameConfig;

import javax.swing.*;
import java.awt.*;

public class GamePanel  extends JFrame {

    public final JButton [][] chessBoardButtons = new JButton[8][8];
    int bKnightRow = 7;
    int bKnightCol = 1;
    int bKnightRow2 = 7;
    int bKnightCol2 = 6;
    int wKnightRow2 = 0;
    int wKnightCol2 = 6;
    int wKnightRow = 0;
    int wKnightCol = 1;
    int bTowerRow = 7;
    int bTowerCol = 0;
    int bTowerRow2 = 7;
    int bTowerCol2 = 7;
    int wTowerRow = 0;
    int wTowerCol = 0;
    int wTowerRow2 = 0;
    int wTowerCol2 = 7;
    int bBishopRow = 7;
    int bBishopCol = 2;
    int bBishopRow2 = 7;
    int bBishopCol2 = 5;
    int wBishopRow = 0;
    int wBishopCol = 2;
    int wBishopRow2 = 0;
    int wBishopCol2 = 5;
    int bQueenRow = 7;
    int bQueenCol = 3;
    int wQueenRow = 0;
    int wQueenCol = 3;
    int bKingRow = 7;
    int bKingCol = 4;
    int wKingRow = 0;
    int wKingCol = 4;
    int wPawnRow = 1;
    int bPawnRow = 6;

    GamePanel () {
        GameConfig gameConfig = new GameConfig(chessBoardButtons);

        Container container = getContentPane();
        container.setLayout(new GridLayout(8,8));

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

        for (int x = 0; x < 8 ; x ++){
            ImageIcon wPawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
            chessBoardButtons[wPawnRow][x].setIcon(wPawnIcon);
        }

        for (int x = 0; x < 8 ; x ++){
            ImageIcon bPawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
            chessBoardButtons[bPawnRow][x].setIcon(bPawnIcon);
        }

        ImageIcon wKnightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[wKnightRow][wKnightCol].setIcon(wKnightIcon);

        ImageIcon wKnightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
        chessBoardButtons[wKnightRow2][wKnightCol2].setIcon(wKnightIcon2);

        ImageIcon bKnightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[bKnightRow][bKnightCol].setIcon(bKnightIcon);

        ImageIcon bKnightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
        chessBoardButtons[bKnightRow2][bKnightCol2].setIcon(bKnightIcon2);

        ImageIcon bTowerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
        chessBoardButtons[bTowerRow][bTowerCol].setIcon(bTowerIcon);

        ImageIcon bTowerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
        chessBoardButtons[bTowerRow2][bTowerCol2].setIcon(bTowerIcon2);

        ImageIcon wTowerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
        chessBoardButtons[wTowerRow][wTowerCol].setIcon(wTowerIcon);

        ImageIcon wTowerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
        chessBoardButtons[wTowerRow2][wTowerCol2].setIcon(wTowerIcon2);

        ImageIcon bBishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
        chessBoardButtons[bBishopRow][bBishopCol].setIcon(bBishopIcon);

        ImageIcon bBishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
        chessBoardButtons[bBishopRow2][bBishopCol2].setIcon(bBishopIcon2);

        ImageIcon wBishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
        chessBoardButtons[wBishopRow][wBishopCol].setIcon(wBishopIcon);

        ImageIcon wBishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
        chessBoardButtons[wBishopRow2][wBishopCol2].setIcon(wBishopIcon2);

        ImageIcon bQueenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen.png");
        chessBoardButtons[bQueenRow][bQueenCol].setIcon(bQueenIcon);

        ImageIcon wQueenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen_w.png");
        chessBoardButtons[wQueenRow][wQueenCol].setIcon(wQueenIcon);

        ImageIcon bKingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king.png");
        chessBoardButtons[bKingRow][bKingCol].setIcon(bKingIcon);

        ImageIcon wKingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king_w.png");
        chessBoardButtons[wKingRow][wKingCol].setIcon(wKingIcon);

        setSize(800,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


