package org.gdcr.gameOfLife;

public class GameOfLife {

	private final int rows;
	private final int columns;
	private final String[][] board;

	public GameOfLife(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		board = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = ".";
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sb.append(board[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public void addCell(int row, int col) {
		if (row >= 0 && row < this.rows && col >= 0
				&& col < this.columns)
			board[row][col] = "O";
	}

	public int countNeighbours(int row, int col) {
		int neighbours = 0;
		if (board[row - 1][col - 1].equals("O"))
			neighbours++;
		if (board[row - 1][col].equals("O"))
			neighbours++;
		if (board[row - 1][col + 1].equals("O"))
			neighbours++;
		if (board[row][col - 1].equals("O"))
			neighbours++;
		if (board[row][col + 1].equals("O"))
			neighbours++;
		if (board[row + 1][col - 1].equals("O"))
			neighbours++;
		if (board[row + 1][col].equals("O"))
			neighbours++;
		if (board[row + 1][col + 1].equals("O"))
			neighbours++;
		return neighbours;
	}

}
