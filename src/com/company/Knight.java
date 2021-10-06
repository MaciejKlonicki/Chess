package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knight implements ActionListener {

    private final ImageIcon knightIcon = new ImageIcon("knight.png");
    private int row = 7;
    private int col = 1;
    private final JButton [][] chessBoardButtons;

    Knight (JButton [][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    private boolean isValidMove (int i, int j) {
        int rowDelta = Math.abs(i - row);
        int colDelta = Math.abs(j - col);

        if ((rowDelta == 1) && (colDelta == 2)) {
            return true;
        }

        return (colDelta == 1) && (rowDelta == 2);
    }

    private void processClick (int i, int j) {
        if (!isValidMove(i, j)) {
            return;
        }
        chessBoardButtons[row][col].setIcon(null);
        chessBoardButtons[i][j].setIcon(knightIcon);
        row = i;
        col = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 8; i ++) {
            for (int j = 0 ; j < 8 ; j ++) {
                if (source == chessBoardButtons[i][j]) {
                    processClick(i,j);
                    return;
                }
            }
        }
    }
}

