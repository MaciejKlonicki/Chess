package com.company.Pieces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tower implements ActionListener {

    private final ImageIcon w_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int w_tower_row = 0;
    private int w_tower_col = 0;

    private boolean playerTurn;

    private final ImageIcon b_towerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
    private int b_tower_row = 7;
    private int b_tower_col = 1;
    private final JButton[][] chessBoardButtons;

    public Tower(JButton[][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
