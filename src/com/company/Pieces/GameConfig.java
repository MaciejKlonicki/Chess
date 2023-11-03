package com.company.Pieces;

import javax.swing.*;
import java.awt.event.*;

public class GameConfig implements MouseListener {
    Object source;
    private boolean playerTurn;

    private final ImageIcon wKnightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
    private int wKnightRow = 0;
    private int wKnightCol = 1;
    private final ImageIcon wKnightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight_w.png");
    private  int wKnightRow2 = 0;
    private  int wKnightCol2 = 6;

    private final ImageIcon bKnightIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
    private int bKnightRow = 7;
    private int bKnightCol = 1;
    private final ImageIcon bKnightIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\knight.png");
    private int bKnightRow2 = 7;
    private int bKnightCol2 = 6;

    private final ImageIcon wTowerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int wTowerRow = 0;
    private int wTowerCol = 0;
    private final ImageIcon wTowerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower_w.png");
    private int wTowerRow2 = 0;
    private int wTowerCol2 = 7;

    private final ImageIcon bTowerIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
    private int bTowerRow = 7;
    private int bTowerCol = 0;
    private final ImageIcon bTowerIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\tower.png");
    private int bTowerRow2 = 7;
    private int bTowerCol2 = 7;

    private final ImageIcon wBishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
    private int wBishopRow = 0;
    private int wBishopCol = 2;
    private final ImageIcon wBishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop_w.png");
    private int wBishopRow2 = 0;
    private int wBishopCol2 = 5;

    private final ImageIcon bBishopIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int bBishopRow = 7;
    private int bBishopCol = 2;
    private final ImageIcon bBishopIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\bishop.png");
    private int bBishopRow2 = 7;
    private int bBishopCol2 = 5;

    private final ImageIcon bQueenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen.png");
    private int bQueenRow = 7;
    private int bQueenCol = 3;
    private final ImageIcon wQueenIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\queen_w.png");
    private int wQueenRow = 0;
    private int wQueenCol = 3;

    private final ImageIcon bKingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king.png");
    private int bKingRow = 7;
    private int bKingCol = 4;
    private final ImageIcon wKingIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\king_w.png");
    private int wKingRow = 0;
    private int wKingCol = 4;

    private final ImageIcon bPawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow = 6;
    private int bPawnCol = 0;
    private final ImageIcon bPawnIcon1 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow1 = 6;
    private int bPawnCol1 = 1;
    private final ImageIcon bPawnIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow2 = 6;
    private int bPawnCol2 = 2;
    private final ImageIcon bPawnIcon3 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow3 = 6;
    private int bPawnCol3 = 3;
    private final ImageIcon bPawnIcon4 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow4 = 6;
    private int bPawnCol4 = 4;
    private final ImageIcon bPawnIcon5 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow5 = 6;
    private int bPawnCol5 = 5;
    private final ImageIcon bPawnIcon6 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow6 = 6;
    private int bPawnCol6 = 6;
    private final ImageIcon bPawnIcon7 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn.png");
    private int bPawnRow7 = 6;
    private int bPawnCol7 = 7;
    private final ImageIcon wPawnIcon = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow = 1;
    private int wPawnCol = 0;
    private final ImageIcon wPawnIcon1 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow1 = 1;
    private int wPawnCol1 = 1;
    private final ImageIcon wPawnIcon2 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow2 = 1;
    private int wPawnCol2 = 2;
    private final ImageIcon wPawnIcon3 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow3 = 1;
    private int wPawnCol3 = 3;
    private final ImageIcon wPawnIcon4 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow4 = 1;
    private int wPawnCol4 = 4;
    private final ImageIcon wPawnIcon5 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow5 = 1;
    private int wPawnCol5 = 5;
    private final ImageIcon wPawnIcon6 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow6 = 1;
    private int wPawnCol6 = 6;
    private final ImageIcon wPawnIcon7 = new ImageIcon("D:\\Program Files\\JetBrains\\Chess\\src\\com\\company\\Images\\pawn_w.png");
    private int wPawnRow7 = 1;
    private int wPawnCol7 = 7;


    private final JButton [][] chessBoardButtons;

    // constructor
    public GameConfig(JButton [][] chessBoardButtons) {
        this.chessBoardButtons = chessBoardButtons;
    }

    //check knight valid move
    public boolean isKnightValidMove(int i, int j) {
        if (playerTurn) {
            int rowDelta = Math.abs((i - bKnightRow));
            int colDelta = Math.abs((j - bKnightCol));
            int rowDelta2 = Math.abs((i - bKnightRow2));
            int colDelta2 = Math.abs((j - bKnightCol2));

            return (rowDelta == 1) && (colDelta == 2) || (rowDelta2 == 1) && (colDelta2 == 2) || (colDelta == 1) && (rowDelta == 2) || (colDelta2 == 1) && (rowDelta2 == 2);

        } else {
                    int rowDelta3 = Math.abs(i - wKnightRow);
                    int colDelta3 = Math.abs(j - wKnightCol);
                    int rowDelta4 = Math.abs(i - wKnightRow2);
                    int colDelta4 = Math.abs(j - wKnightCol2);

            return ((rowDelta3 == 1) && (colDelta3 == 2)) || ((rowDelta4 == 1) && (colDelta4 == 2)) || ((colDelta3 == 1) && (rowDelta3 == 2)) || ((colDelta4 == 1) && (rowDelta4 == 2));
                }
    }

    //check King valid move
    public boolean isKingValidMove (int i, int j) {
        if (playerTurn){
            int kowDelta = Math.abs((i - bKingRow));
            int kolDelta = Math.abs((j - bKingCol));
            return kowDelta == 1 && kolDelta == 1;
        }
        else {
            int kowDelta2 = Math.abs((i - wKingRow));
            int kolDelta2 = Math.abs((j - wKingCol));
            return kowDelta2 == 1 && kolDelta2 == 1;
        }
    }

    //check Queenvalid move
    public boolean isQueenValidMove (int i, int j) {
        if (playerTurn){
            int qowDelta = Math.abs((i - bQueenRow));
            int qolDelta = Math.abs((j - bQueenCol));

            for (int x = 0; x <= 7; ++ x) {
                if ((qowDelta == x && qolDelta == 0) || (qowDelta == x && qolDelta == 1)){
                    return true;
                }
            }

        } else {
            int qowDelta2 = Math.abs((i - wQueenRow));
            int qolDelta2 = Math.abs((j - wQueenCol));

            for (int x = 0; x <= 7; ++ x) {
                if ((qowDelta2 == x && qolDelta2 == 0) || (qowDelta2 == x && qolDelta2 == 1)){
                    return true;
                }
            }

        }
        return false;
    }

    //check rook valid move
    public boolean isRookValidMove (int i, int j) {
        if (playerTurn){
            int towDelta = Math.abs((i - bTowerRow));
            int tolDelta = Math.abs((j - bTowerCol));
            int towDelta2 = Math.abs((i - bTowerRow2));
            int tolDelta2 = Math.abs((j - bTowerCol2));

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
            int towDelta3 = Math.abs(i - wTowerRow);
            int tolDelta3 = Math.abs(j - wTowerCol);
            int towDelta4 = Math.abs(i - wTowerRow2);
            int tolDelta4 = Math.abs(j - wTowerCol2);

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

    //check bishop valid move
    public boolean isBishopValidMove (int i, int j) {
        if (playerTurn) {
            int bowDelta = Math.abs((i - bBishopRow));
            int bolDelta = Math.abs((j - bBishopCol));
            int bowDelta2 = Math.abs((i - bBishopRow2));
            int bolDelta2 = Math.abs((j - bBishopCol2));

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
            int bowDelta3 = Math.abs(i - wBishopRow);
            int bolDelta3 = Math.abs(j - wBishopCol);
            int bowDelta4 = Math.abs(i - wBishopRow2);
            int bolDelta4 = Math.abs(j - wBishopCol2);

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
                        if (e.getSource() == chessBoardButtons[bKnightRow][bKnightCol]) {
                            chessBoardButtons[bKnightRow][bKnightCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bKnightIcon);
                            bKnightRow = i;
                            bKnightCol = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bKnightRow2][bKnightCol2]) {
                            chessBoardButtons[bKnightRow2][bKnightCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bKnightIcon2);
                            bKnightRow2 = i;
                            bKnightCol2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wKnightRow][wKnightCol]) {
                            chessBoardButtons[wKnightRow][wKnightCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wKnightIcon);
                            wKnightRow = i;
                            wKnightCol = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wKnightRow2][wKnightCol2]) {
                            chessBoardButtons[wKnightRow2][wKnightCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wKnightIcon2);
                            wKnightRow2 = i;
                            wKnightCol2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[bTowerRow][bTowerCol]) {
                            chessBoardButtons[bTowerRow][bTowerCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bTowerIcon);
                            bTowerRow = i;
                            bTowerCol = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bTowerRow2][bTowerCol2]) {
                            chessBoardButtons[bTowerRow2][bTowerCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bTowerIcon2);
                            bTowerRow2 = i;
                            bTowerCol2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wTowerRow][wTowerCol]) {
                            chessBoardButtons[wTowerRow][wTowerCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wTowerIcon);
                            wTowerRow = i;
                            wTowerCol = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wTowerRow2][wTowerCol2]) {
                            chessBoardButtons[wTowerRow2][wTowerCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wTowerIcon2);
                            wTowerRow2 = i;
                            wTowerCol2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[bBishopRow][bBishopCol]) {
                            chessBoardButtons[bBishopRow][bBishopCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bBishopIcon);
                            bBishopRow = i;
                            bBishopCol = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bBishopRow2][bBishopCol2]) {
                            chessBoardButtons[bBishopRow2][bBishopCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bBishopIcon2);
                            bBishopRow2 = i;
                            bBishopCol2 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wBishopRow][wBishopCol]) {
                            chessBoardButtons[wBishopRow][wBishopCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wBishopIcon);
                            wBishopRow = i;
                            wBishopCol = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wBishopRow2][wBishopCol2]) {
                            chessBoardButtons[wBishopRow2][wBishopCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wBishopIcon);
                            wBishopRow2 = i;
                            wBishopCol2 = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[bQueenRow][bQueenCol]) {
                            chessBoardButtons[bQueenRow][bQueenCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bQueenIcon);
                            bQueenRow = i;
                            bQueenCol = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wQueenRow][wQueenCol]) {
                            chessBoardButtons[wQueenRow][wQueenCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wQueenIcon);
                            wQueenRow = i;
                            wQueenCol = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[bKingRow][bKingCol]) {
                            chessBoardButtons[bKingRow][bKingCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bKingIcon);
                            bKingRow = i;
                            bKingCol = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wKingRow][wKingCol]) {
                            chessBoardButtons[wKingRow][wKingCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wKingIcon);
                            wKingRow = i;
                            wKingCol = j;
                            playerTurn = true;
                        }
                    }
                    if (playerTurn) {
                        if (e.getSource() == chessBoardButtons[bPawnRow][bPawnCol]) {
                            chessBoardButtons[bPawnRow][bPawnCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon);
                            bPawnRow = i;
                            bPawnCol = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow1][bPawnCol1]) {
                            chessBoardButtons[bPawnRow1][bPawnCol1].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon1);
                            bPawnRow1 = i;
                            bPawnCol1 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow2][bPawnCol2]) {
                            chessBoardButtons[bPawnRow2][bPawnCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon2);
                            bPawnRow2 = i;
                            bPawnCol2 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow3][bPawnCol3]) {
                            chessBoardButtons[bPawnRow3][bPawnCol3].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon3);
                            bPawnRow3 = i;
                            bPawnCol3 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow4][bPawnCol4]) {
                            chessBoardButtons[bPawnRow4][bPawnCol4].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon4);
                            bPawnRow4 = i;
                            bPawnCol4 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow5][bPawnCol5]) {
                            chessBoardButtons[bPawnRow5][bPawnCol5].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon5);
                            bPawnRow5 = i;
                            bPawnCol5 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow6][bPawnCol6]) {
                            chessBoardButtons[bPawnRow6][bPawnCol6].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon6);
                            bPawnRow6 = i;
                            bPawnCol6 = j;
                            playerTurn = false;
                        } else if (e.getSource() == chessBoardButtons[bPawnRow7][bPawnCol7]) {
                            chessBoardButtons[bPawnRow7][bPawnCol7].setIcon(null);
                            chessBoardButtons[i][j].setIcon(bPawnIcon7);
                            bPawnRow7 = i;
                            bPawnCol7 = j;
                            playerTurn = false;
                        }
                    }
                    else {
                        if (e.getSource() == chessBoardButtons[wPawnRow][wPawnCol]) {
                            chessBoardButtons[wPawnRow][wPawnCol].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon);
                            wPawnRow = i;
                            wPawnCol = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow1][wPawnCol1]) {
                            chessBoardButtons[wPawnRow1][wPawnCol1].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon1);
                            wPawnRow1 = i;
                            wPawnCol1 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow2][wPawnCol2]) {
                            chessBoardButtons[wPawnRow2][wPawnCol2].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon2);
                            wPawnRow2 = i;
                            wPawnCol2 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow3][wPawnCol3]) {
                            chessBoardButtons[wPawnRow3][wPawnCol3].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon3);
                            wPawnRow3 = i;
                            wPawnCol3 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow4][wPawnCol4]) {
                            chessBoardButtons[wPawnRow4][wPawnCol4].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon4);
                            wPawnRow4 = i;
                            wPawnCol4 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow5][wPawnCol5]) {
                            chessBoardButtons[wPawnRow5][wPawnCol5].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon5);
                            wPawnRow5 = i;
                            wPawnCol5 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow6][wPawnCol6]) {
                            chessBoardButtons[wPawnRow6][wPawnCol6].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon6);
                            wPawnRow6 = i;
                            wPawnCol6 = j;
                            playerTurn = true;
                        } else if (e.getSource() == chessBoardButtons[wPawnRow7][wPawnCol7]) {
                            chessBoardButtons[wPawnRow7][wPawnCol7].setIcon(null);
                            chessBoardButtons[i][j].setIcon(wPawnIcon7);
                            wPawnRow7 = i;
                            wPawnCol7 = j;
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

