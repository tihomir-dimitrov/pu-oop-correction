package Pieces;

import java.awt.*;

public class SofisticatedSam {

    private int row;
    private int col;

    public SofisticatedSam(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void SamPiece(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval(1125,25,50,50);
        g.fillOval(1125,100,50,50);
        g.fillOval(1125,175,50,50);

        g.fillOval(1125,666,50,50);
        g.fillOval(1125,735,50,50);
        g.fillOval(1125,800,50,50);
    }
}
