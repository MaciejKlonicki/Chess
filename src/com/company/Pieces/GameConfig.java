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

    private final JButton [][] chessBoardButtons;

    public GameConfig(JButton [][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    public boolean isValidKnightMove(int i, int j) {
        if (playerTurn) {
            int rowDelta = Math.abs((i - b_knight_row));
            int colDelta = Math.abs((j - b_knight_col));
            int rowDelta2 = Math.abs((i - b_knight_row2));
            int colDelta2 = Math.abs((j - b_knight_col2));

            if (((rowDelta == 1) && (colDelta == 2)) || ((rowDelta2 == 1) && (colDelta2 == 2))) {
                return true;
            }
            return ((colDelta == 1) && (rowDelta == 2) || (colDelta2 == 1) && (rowDelta2 == 2));

                } else {
                    int rowDelta3 = Math.abs((i - w_knight_row));
                    int colDelta3 = Math.abs((j - w_knight_col));
                    int rowDelta4 = Math.abs((i - w_knight_row2));
                    int colDelta4 = Math.abs((j - w_knight_col2));

                    if ((rowDelta3 == 1) && (colDelta3 == 2) || (rowDelta4 == 1) && (colDelta4 == 2)) {
                        return true;
                    }
                    return ((colDelta3 == 1) && (rowDelta3 == 2) || (colDelta4 == 1) && (rowDelta4 == 2));
                }
            }
    public boolean isValidRookMove(int i, int j) {
        if (playerTurn) {
            int rowDelta = Math.abs((i - b_tower_row));
            int colDelta = Math.abs((j - b_tower_col));
        }
            }

    @Override
    public void mouseClicked(MouseEvent e) {
                source = e.getSource();
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (source == chessBoardButtons[i][j]) {
                    if (!isValidKnightMove(i, j) || (!isValidRookMove(i, j))) {
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

