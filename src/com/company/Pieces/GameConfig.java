package com.company.Pieces;

import javax.swing.*;
import java.awt.event.*;

public class GameConfig implements MouseListener {

    Object source;
    public boolean playerTurn;
    private final ImageIcon w_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
    private int w_knight_row = 0;
    private int w_knight_col = 1;
    private final ImageIcon w_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
    private  int w_knight_row2 = 0;
    private  int w_knight_col2 = 6;

    private final ImageIcon b_knightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
    private int b_knight_row = 7;
    private int b_knight_col = 1;
    private final ImageIcon b_knightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
    private int b_knight_row2 = 7;
    private int b_knight_col2 = 6;

    private final ImageIcon w_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int w_tower_row = 0;
    private int w_tower_col = 0;
    private final ImageIcon w_towerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int w_tower_row2 = 0;
    private int w_tower_col2 = 7;

    private final ImageIcon b_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
    private int b_tower_row = 7;
    private int b_tower_col = 0;
    private final ImageIcon b_towerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
    private int b_tower_row2 = 7;
    private int b_tower_col2 = 7;

    private final ImageIcon w_bishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
    private int w_bishop_row = 0;
    private int w_bishop_col = 2;
    private final ImageIcon w_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
    private int w_bishop_row2 = 0;
    private int w_bishop_col2 = 5;

    private final ImageIcon b_bishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int b_bishop_row = 7;
    private int b_bishop_col = 2;
    private final ImageIcon b_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int b_bishop_row2 = 7;
    private int b_bishop_col2 = 5;

    private final ImageIcon b_queenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen.png");
    private int b_queen_row = 7;
    private int b_queen_col = 3;
    private final ImageIcon w_queenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen_w.png");
    private int w_queen_row = 0;
    private int w_queen_col = 3;

    private final ImageIcon b_kingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king.png");
    private int b_king_row = 7;
    private int b_king_col = 4;
    private final ImageIcon w_kingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king_w.png");
    private int w_king_row = 0;
    private int w_king_col = 4;

    private final ImageIcon b_pawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int b_pawn_row = 6;
    private final ImageIcon w_pawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int w_pawn_row = 1;

    private final JButton [][] chessBoardButtons;

    public GameConfig(JButton [][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    public boolean isKnightValidMove(int i, int j) {
        if (playerTurn) {
            int rowDelta = Math.abs((i - b_knight_row));
            int colDelta = Math.abs((j - b_knight_col));
            int rowDelta2 = Math.abs((i - b_knight_row2));
            int colDelta2 = Math.abs((j - b_knight_col2));

            return (rowDelta == 1) && (colDelta == 2) || (rowDelta2 == 1) && (colDelta2 == 2) || (colDelta == 1) && (rowDelta == 2) || (colDelta2 == 1) && (rowDelta2 == 2);

        } else {
                    int rowDelta3 = Math.abs(i - w_knight_row);
                    int colDelta3 = Math.abs(j - w_knight_col);
                    int rowDelta4 = Math.abs(i - w_knight_row2);
                    int colDelta4 = Math.abs(j - w_knight_col2);

            return ((rowDelta3 == 1) && (colDelta3 == 2)) || ((rowDelta4 == 1) && (colDelta4 == 2)) || ((colDelta3 == 1) && (rowDelta3 == 2)) || ((colDelta4 == 1) && (rowDelta4 == 2));
                }
    }

    public boolean isKingValidMove (int i, int j) {
        if (playerTurn){
            int kowDelta = Math.abs((i - b_king_row));
            int kolDelta = Math.abs((j - b_king_col));
            return kowDelta == 1 && kolDelta == 1;
        }
        else {
            int kowDelta2 = Math.abs((i - w_king_row));
            int kolDelta2 = Math.abs((j - w_king_col));
            return kowDelta2 == 1 && kolDelta2 == 1;
        }
    }

    public boolean isQueenValidMove (int i, int j) {
        if (playerTurn){
            int qowDelta = Math.abs((i - b_queen_row));
            int qolDelta = Math.abs((j - b_queen_col));

            for (int x = 0; x <= 7; ++ x) {
                if ((qowDelta == x && qolDelta == 0) || (qowDelta == x && qolDelta == 1)){
                    return true;
                }
            }

        } else {
            int qowDelta2 = Math.abs((i - w_queen_row));
            int qolDelta2 = Math.abs((j - w_queen_col));

            for (int x = 0; x <= 7; ++ x) {
                if ((qowDelta2 == x && qolDelta2 == 0) || (qowDelta2 == x && qolDelta2 == 1)){
                    return true;
                }
            }

        }
        return false;
    }

    public boolean isRookValidMove (int i, int j) {
        if (playerTurn){
            int towDelta = Math.abs((i - b_tower_row));
            int tolDelta = Math.abs((j - b_tower_col));
            int towDelta2 = Math.abs((i - b_tower_row2));
            int tolDelta2 = Math.abs((j - b_tower_col2));

            for (int x = 0 ; x <= 7 ; ++ x) {
                if (towDelta == x && tolDelta == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (tolDelta == x && towDelta == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (towDelta2 == x && tolDelta2 == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (tolDelta2 == x && towDelta2 == 0) {
                    return true;
                }
            }

        } else {
            int towDelta3 = Math.abs(i - w_tower_row);
            int tolDelta3 = Math.abs(j - w_tower_col);
            int towDelta4 = Math.abs(i - w_tower_row2);
            int tolDelta4 = Math.abs(j - w_tower_col2);

            for (int x = 0 ; x <= 7 ; ++ x) {
                if (towDelta3 == x && tolDelta3 == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (tolDelta3 == x && towDelta3 == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (towDelta4 == x && tolDelta4 == 0) {
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++ x) {
                if (tolDelta4 == x && towDelta4 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBishopValidMove (int i, int j) {
        if (playerTurn) {
            int bowDelta = Math.abs((i - b_bishop_row));
            int bolDelta = Math.abs((j - b_bishop_col));
            int bowDelta2 = Math.abs((i - b_bishop_row2));
            int bolDelta2 = Math.abs((j - b_bishop_col2));

            for (int x = 0 ; x <= 7 ; ++x){
                if (bowDelta == x && (bolDelta == 1)){
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++x){
                if (bowDelta2 == x && (bolDelta2 == 1)){
                    return true;
                }
            }
        } else {
            int bowDelta3 = Math.abs(i - w_bishop_row);
            int bolDelta3 = Math.abs(j - w_bishop_col);
            int bowDelta4 = Math.abs(i - w_bishop_row2);
            int bolDelta4 = Math.abs(j - w_bishop_col2);

            for (int x = 0 ; x <= 7 ; ++x){
                if (bowDelta3 == x && (bolDelta3 == 1)){
                    return true;
                }
            }
            for (int x = 0 ; x <= 7 ; ++x){
                if (bowDelta4 == x && (bolDelta4 == 1)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void mouseClicked(MouseEvent e) { source = e.getSource(); }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (source == chessBoardButtons[i][j]) {
                    if (!isKnightValidMove(i, j) && (!isRookValidMove(i, j)) && (!isBishopValidMove(i, j)) && (!isQueenValidMove(i, j)) && (!isKingValidMove(i, j))) {
                        return;
                    }
                    if (playerTurn) {
                        System.out.println("BLACK");
                        if (e.getSource() == chessBoardButtons[b_knight_row][b_knight_col]) {
                            chessBoardButtons[b_knight_row][b_knight_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_knightIcon);
                            b_knight_row = i;
                            b_knight_col = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[b_knight_row2][b_knight_col2]) {
                            chessBoardButtons[b_knight_row2][b_knight_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_knightIcon2);
                            b_knight_row2 = i;
                            b_knight_col2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        System.out.println("WHITE");
                        if (e.getSource() == chessBoardButtons[w_knight_row][w_knight_col]) {
                            chessBoardButtons[w_knight_row][w_knight_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_knightIcon);
                            w_knight_row = i;
                            w_knight_col = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[w_knight_row2][w_knight_col2]) {
                            chessBoardButtons[w_knight_row2][w_knight_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_knightIcon2);
                            w_knight_row2 = i;
                            w_knight_col2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[b_tower_row][b_tower_col]) {
                            chessBoardButtons[b_tower_row][b_tower_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_towerIcon);
                            b_tower_row = i;
                            b_tower_col = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[b_tower_row2][b_tower_col2]) {
                            chessBoardButtons[b_tower_row2][b_tower_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_towerIcon2);
                            b_tower_row2 = i;
                            b_tower_col2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[w_tower_row][w_tower_col]) {
                            chessBoardButtons[w_tower_row][w_tower_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_towerIcon);
                            w_tower_row = i;
                            w_tower_col = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[w_tower_row2][w_tower_col2]) {
                            chessBoardButtons[w_tower_row2][w_tower_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_towerIcon2);
                            w_tower_row2 = i;
                            w_tower_col2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[b_bishop_row][b_bishop_col]) {
                            chessBoardButtons[b_bishop_row][b_bishop_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_bishopIcon);
                            b_bishop_row = i;
                            b_bishop_col = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[b_bishop_row2][b_bishop_col2]) {
                            chessBoardButtons[b_bishop_row2][b_bishop_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_bishopIcon2);
                            b_bishop_row2 = i;
                            b_bishop_col2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[w_bishop_row][w_bishop_col]) {
                            chessBoardButtons[w_bishop_row][w_bishop_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_bishopIcon);
                            w_bishop_row = i;
                            w_bishop_col = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[w_bishop_row2][w_bishop_col2]) {
                            chessBoardButtons[w_bishop_row2][w_bishop_col2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_bishopIcon2);
                            w_bishop_row2 = i;
                            w_bishop_col2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[b_queen_row][b_queen_col]) {
                            chessBoardButtons[b_queen_row][b_queen_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_queenIcon);
                            b_queen_row = i;
                            b_queen_col = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[w_queen_row][w_queen_col]) {
                            chessBoardButtons[w_queen_row][w_queen_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_queenIcon);
                            w_queen_row = i;
                            w_queen_col = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[b_king_row][b_king_col]) {
                            chessBoardButtons[b_king_row][b_king_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(b_kingIcon);
                            b_king_row = i;
                            b_king_col = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[w_king_row][w_king_col]) {
                            chessBoardButtons[w_king_row][w_king_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_kingIcon);
                            w_king_row = i;
                            w_king_col = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        for (int x = 0; x < 8 ; x ++) {
                            if (e.getSource() == chessBoardButtons[b_pawn_row][x]) {
                                chessBoardButtons[b_king_row][b_king_col].setIcon(null);
                                chessBoardButtons[i][j].setIcon(b_kingIcon);
                                b_king_row = i;
                                b_king_col = j;
                                playerTurn = false;
                            }
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[w_king_row][w_king_col]) {
                            chessBoardButtons[w_king_row][w_king_col].setIcon(null);
                            chessBoardButtons[i][j].setIcon(w_kingIcon);
                            w_king_row = i;
                            w_king_col = j;
                            playerTurn = true;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

