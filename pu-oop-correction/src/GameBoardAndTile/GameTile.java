package GameBoardAndTile;

import javax.swing.*;
import java.awt.*;

public class GameTile extends JFrame {

    public static final int TILE_SIZE = 100;
    private int row;
    private int col;

    public GameTile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g){
        {
                boardGrid(g);
        }
    }
    void boardGrid(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i <= 1200; i += 100) {
            for (int j = 20; j <= 1200; j += 70) {
                g.drawRect(i, j, 100, 70);
            }
        }
    }
}
