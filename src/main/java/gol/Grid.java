package gol;

import java.util.ArrayList;

public class Grid {
    public static int maxX = 100;
    public static int maxY = 100;

    public static boolean[][] field = new boolean[maxX][maxY];

    public static void initialize() {
        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxY; y++) {
                field[x][y] = false;
            }
        }
    }

    public static void toggle(Position p) {
        if (p.isValid()) {
            field[p.x][p.y] = !field[p.x][p.y];
        }
    }

    public static void set(Position p) {
        if (p.isValid()) {
            field[p.x][p.y] = true;
        }
    }

    public static void set(ArrayList<Position> p) {
        for (Position p1 : p) {
            set(p1);
        }
    }

    public static void set(Position[] p) {
        for (Position p1 : p) {
            set(p1);
        }
    }

    public static void phase() {
        boolean[][] newField = new boolean[maxX][maxY];

        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxY; y++) {
                Position currPos = new Position(x, y);

                Position[] neighbours = currPos.getAllNeighbours();

                int aliveCount = 0;

                for (Position neighbour : neighbours) {
                    if (neighbour.isValid() && field[neighbour.x][neighbour.y]) {
                        aliveCount++;
                    }
                }

                if (field[x][y]) {
                    newField[x][y] = (aliveCount == 2 || aliveCount == 3);
                } else {
                    newField[x][y] = (aliveCount == 3);
                }
            }
        }

        field = newField;
    }
}
