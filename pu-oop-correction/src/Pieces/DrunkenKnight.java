package Pieces;

import java.awt.*;

public class DrunkenKnight{

    private int row;
    private int col;

    public DrunkenKnight(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void DKnightPiece(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(125, 25, 50, 50);
        g.fillRect(125, 100, 50, 50);
        g.fillRect(125, 175, 50, 50);

        g.fillRect(125, 666, 50, 50);
        g.fillRect(125, 735, 50, 50);
        g.fillRect(125, 800, 50, 50);
    }
}
