package gol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameOfLifeGUI extends JPanel implements MouseListener {
    private static final int CELL_SIZE = 8; // Size of each cell in pixels
    private static final int WIDTH = Grid.maxX * CELL_SIZE;
    private static final int HEIGHT = Grid.maxY * CELL_SIZE;

    public GameOfLifeGUI() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = 0; x < Grid.maxX; x++) {
            for (int y = 0; y < Grid.maxY; y++) {
                if (Grid.field[x][y]) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(y * CELL_SIZE, x * CELL_SIZE, CELL_SIZE, CELL_SIZE);

                g.setColor(Color.LIGHT_GRAY);
                g.drawRect(y * CELL_SIZE, x * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    public void refresh() {
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int y = e.getX() / CELL_SIZE;
        int x = e.getY() / CELL_SIZE;

        Grid.toggle(new Position(x, y));

        repaint();
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
}
