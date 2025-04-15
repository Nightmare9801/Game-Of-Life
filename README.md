# Conway's Game of Life - Java (Swing GUI)

A basic implementation of Conway's Game of Life in Java with a graphical interface using Swing. You can click to toggle cells, and use buttons to control the simulation.

## 🚀 Features

- Interactive grid (click to toggle cells)
- Start, Pause, and Restart simulation
- Simple, extendable structure
- Efficient 2D array logic for simulation phases

## 🧠 Game Rules

Each cell on the grid is either **alive** or **dead**. At each step of the simulation, the following rules are applied:

1. **Underpopulation**: A live cell with fewer than 2 live neighbors dies.
2. **Survival**: A live cell with 2 or 3 live neighbors lives on.
3. **Overpopulation**: A live cell with more than 3 live neighbors dies.
4. **Reproduction**: A dead cell with exactly 3 live neighbors becomes alive.

## 🖱️ Controls

| Button      | Action                                      |
|-------------|---------------------------------------------|
| **Start**   | Starts the simulation                       |
| **Pause**   | Pauses the simulation                       |
| **Restart** | Clears the board and stops the simulation   |

You can also **click on any cell** in the grid to toggle it between alive and dead.

## 🛠️ Requirements

- Java 8 or above
- A Java IDE (e.g., IntelliJ, Eclipse) or command line with `javac`/`java`

## 🧪 Running the Project

### From IDE:
1. Clone or download the project.
2. Open in your favorite Java IDE.
3. Run `Main.java`.

### From Terminal:
```bash
  javac gol/*.java
  java gol.Main
```

## License

This project is licensed under the GNU Public License


