package GameBoardAndTile;

import Pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {

    private Object[][] pieceCollection;
    private Object selectedPiece;

    public GameBoard() {
        this.setSize(1200, 1200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                GameTile tile = new GameTile(row, col);
                tile.render(g);

                DogEatingBug dog = new DogEatingBug(row, col);
                dog.DogPiece(g);

                DrunkenKnight knight = new DrunkenKnight(row, col);
                knight.DKnightPiece(g);

                MagicCat cat = new MagicCat(row, col);
                cat.CatPiece(g);

                RecklessCanibal can = new RecklessCanibal(row, col);
                can.CanibalPiece(g);

                SandTurtle turtle = new SandTurtle(row, col);
                turtle.TurtlePiece(g);

                SofisticatedSam sam = new SofisticatedSam(row, col);
                sam.SamPiece(g);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int row = this.getBoardDimentionBasedOnCoordinates(e.getY());
        int col = this.getBoardDimentionBasedOnCoordinates(e.getX());

        if(this.selectedPiece != null) {

            DogEatingBug p1 = (DogEatingBug)this.selectedPiece;
          // DrunkenKnight p2 = (DrunkenKnight) this.selectedPiece;
            p1.move(row, col);
          //  p2.move(row, col);
            this.selectedPiece = null;
            this.repaint();
        }

        if(this.hasBoardPiece(row, col)) {
            this.selectedPiece = this.getBoardPiece(row, col);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }

    private Object getBoardPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }

    private boolean hasBoardPiece(int row, int col) {
        return this.getBoardPiece(row, col) != null;
    }
}
