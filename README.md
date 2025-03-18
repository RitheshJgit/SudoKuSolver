# Sudoku Solver

A **Java-based Sudoku Solver** that allows users to **input a Sudoku puzzle manually** or **generate a random puzzle** and solves it using **Backtracking Algorithm**.

## Features

✅ **User Input Mode** – Enter the Sudoku puzzle manually.\
✅ **Random Board Generation** – Generates a random Sudoku puzzle.\
✅ **Backtracking Algorithm** – Efficiently solves the Sudoku.\
✅ **Validations** – Ensures each number follows Sudoku rules.\
✅ **Command-Line Interface** – Simple & easy to use.

## Technologies Used

- **Java** (Core Logic)
- **IntelliJ IDEA** (Recommended IDE)

## Installation & Setup

### 1. Clone the Repository

```sh
git clone https://github.com/RitheshJgit/SudoKuSolver.git
cd SudoKuSolver
```

### 2. Compile & Run

```sh
javac SudokuSolver.java
java SudokuSolver
```

## How to Use

1. **Run the program.**
2. Choose **manual input** or **random board generation**.
3. If manual, enter **9×9 Sudoku grid** (use `0` for empty cells).
4. The program **solves and prints** the completed Sudoku.

### Example Sudoku Input:

```
5 3 0  0 7 0  0 0 0
6 0 0  1 9 5  0 0 0
0 9 8  0 0 0  0 6 0

8 0 0  0 6 0  0 0 3
4 0 0  8 0 3  0 0 1
7 0 0  0 2 0  0 0 6

0 6 0  0 0 0  2 8 0
0 0 0  4 1 9  0 0 5
0 0 0  0 8 0  0 7 9
```

## Sample Output

```
-------------------------
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
-------------------------
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
-------------------------
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
-------------------------
```

## Algorithm Used

This project uses the **Backtracking Algorithm**, which:

1. Finds an **empty cell** in the Sudoku grid.
2. Tries placing numbers **1-9** while following Sudoku rules.
3. If a number is valid, it **proceeds to the next empty cell**.
4. If stuck, **backtracks and tries a different number**.
5. Repeats until the Sudoku is solved.

## Contributing

1. Fork this repository.
2. Create a new branch: `git checkout -b feature-new`
3. Commit your changes: `git commit -m "Added new feature"`
4. Push & create a PR.

## License

This project is licensed under the **MIT License**.

---
