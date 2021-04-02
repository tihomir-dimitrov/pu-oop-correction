package Pieces;

import java.awt.*;

public class RecklessCanibal {
    private int row;
    private int col;

    public RecklessCanibal(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void CanibalPiece(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(925, 25,50,50);
        g.fillRect(925, 100,50,50);
        g.fillRect(925, 175,50,50);

        g.fillRect(925, 666,50,50);
        g.fillRect(925, 735,50,50);
        g.fillRect(925, 800,50,50);
    }
}
