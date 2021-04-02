package Pieces;

import java.awt.*;

public class MagicCat {

    private int row;
    private int col;

    public MagicCat(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void CatPiece(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(225,25,50,50);
        g.fillOval(225,100,50,50);
        g.fillOval(225,175,50,50);

        g.fillOval(225,666,50,50);
        g.fillOval(225,735,50,50);
        g.fillOval(225,800,50,50);
    }
}
