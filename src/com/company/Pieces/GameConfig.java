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
    private final ImageIcon w_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int w_bishop_row2 = 0;
    private int w_bishop_col2 = 5;

    private final ImageIcon b_bishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int b_bishop_row = 7;
    private int b_bishop_col = 2;
    private final ImageIcon b_bishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int b_bishop_row2 = 7;
    private int b_bishop_col2 = 5;

    private final JButton [][] chessBoardButtons;

    public GameConfig(JButton [][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    public boolean isValidMove(int i, int j) {
        if (playerTurn) {
            int rowDelta = Math.abs((i - b_knight_row));
            int colDelta = Math.abs((j - b_knight_col));
            int rowDelta2 = Math.abs((i - b_knight_row2));
            int colDelta2 = Math.abs((j - b_knight_col2));

            int towDelta = Math.abs((i - b_tower_row));
            int tolDelta = Math.abs((j - b_tower_col));
            int towDelta2 = Math.abs((i - b_tower_row2));
            int tolDelta2 = Math.abs((j - b_tower_col2));

            int bowDelta = Math.abs((i - b_bishop_row));
            int bolDelta = Math.abs((j - b_bishop_col));
            int bowDelta2 = Math.abs((i - b_bishop_row2));
            int bolDelta2 = Math.abs((j - b_bishop_col2));

            if (bowDelta % 2 == 1 && bolDelta == 0) {
                return true;
            }
            if (bowDelta % 2 == 1 && bolDelta == 2) {
                return true;
            }

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

            return ((rowDelta == 1) && (colDelta == 2)) || ((rowDelta2 == 1) && (colDelta2 == 2)) || (colDelta == 1) && (rowDelta == 2) || (colDelta2 == 1) && (rowDelta2 == 2);

        } else {
                    int rowDelta3 = Math.abs(i - w_knight_row);
                    int colDelta3 = Math.abs(j - w_knight_col);
                    int rowDelta4 = Math.abs(i - w_knight_row2);
                    int colDelta4 = Math.abs(j - w_knight_col2);

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

                    if ((rowDelta3 == 1) && (colDelta3 == 2) || (rowDelta4 == 1) && (colDelta4 == 2)) {
                        return true;
                    }
                    return ((colDelta3 == 1) && (rowDelta3 == 2) || (colDelta4 == 1) && (rowDelta4 == 2));
                }
    }

    @Override
    public void mouseClicked(MouseEvent e) { source = e.getSource(); }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (source == chessBoardButtons[i][j]) {
                    if (!isValidMove(i, j)) {
                        return;
                    }
                    if (playerTurn) {
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

