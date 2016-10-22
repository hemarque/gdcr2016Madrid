package org.gdcr.gameOfLife;

import java.util.ArrayList;

public class Board {
	ArrayList<ArrayList<Cell>> cells;

	public Board(int width, int eight) {
		cells = new ArrayList<ArrayList<Cell>>();
	}

	public int getVecinos(int x, int y) {

		return 0;
	}

	public void populate(int x, int y) {
		cells.get(x).set(y, new Cell(true));
	}

}
