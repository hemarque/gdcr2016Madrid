package org.gdcr.gameOfLife;

public class GameOfLife {
	String board = "...\n...\n...\n";

	public GameOfLife(int rows, int columns) {
	}

	@Override
	public String toString() {
		return board;
	}

	public void addCell(int row, int col) {
		board = "O..\n...\n...\n";
	}

}
