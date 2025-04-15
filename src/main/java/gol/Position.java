package gol;

import java.util.ArrayList;

public class Position {
    public int x = 0;
    public int y = 0;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position posToTheRight() {
        return new Position(x, y - 1);
    }

    public Position posToTheLeft() {
        return new Position(x, y + 1);
    }

    public Position posOnTop() {
        return new Position(x - 1, y);
    }

    public Position posOnBottom() {
        return new Position(x + 1, y);
    }

    public Position posTopLeft() {
        return new Position(x - 1, y + 1);
    }

    public Position posTopRight() {
        return new Position(x - 1, y - 1);
    }

    public Position posBottomLeft() {
        return new Position(x + 1, y + 1);
    }

    public Position posBottomRight() {
        return new Position(x + 1, y - 1);
    }

    public Position[] getAllNeighbours() {
        return new Position[] {posBottomLeft(), posBottomRight(), posOnBottom(), posTopRight(), posOnTop(), posTopLeft(), posToTheRight(), posToTheLeft()};
    }

    public boolean isValid() {
        return 0 <= x && x < Grid.maxX && 0 <= y && y < Grid.maxY;
    }
}
