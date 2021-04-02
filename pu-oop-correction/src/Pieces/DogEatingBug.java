package Pieces;

import java.awt.*;
import java.util.Random;

public class DogEatingBug{

    private int row;
    private int col;

    public DogEatingBug(int row, int col) {
        this.row = row;
        this.col = col;
    }

    private int RandomPlacement() {
        Random random = new Random();
        int rand = random.nextInt(8);
        while (rand == 2) {
            rand = random.nextInt(8);
        }
        return rand;
    }

    public void DogPiece(Graphics g){

        int dog1 = RandomPlacement();

        g.setColor(Color.BLUE);
        g.fillRect((dog1*1200)+25, 25,50,50);
        g.fillRect((dog1*1200)+25, 100,50,50);
        g.fillRect((dog1*1200)+25, 175,50,50);

        g.fillRect((dog1*1200)+25, 666,50,50);
        g.fillRect((dog1*1200)+25, 735,50,50);
        g.fillRect((dog1*1200)+25, 800,50,50);

    }

    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoeficient = Math.abs(moveRow - this.row);
        int colCoeficient = moveCol - this.col;

        return  rowCoeficient == 1 &&
                colCoeficient == 0;
    }

    public boolean isAttackValid(int attackRow, int attackCol) {
        return false;
    }

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
