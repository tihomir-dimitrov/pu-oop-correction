package Pieces;

import java.awt.*;

public class SandTurtle {

    private int row;
    private int col;

    public SandTurtle(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void TurtlePiece(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(1025, 25,50,50);
        g.fillRect(1025, 100,50,50);
        g.fillRect(1025, 175,50,50);

        g.fillRect(1025, 666,50,50);
        g.fillRect(1025, 735,50,50);
        g.fillRect(1025, 800,50,50);
    }
}
