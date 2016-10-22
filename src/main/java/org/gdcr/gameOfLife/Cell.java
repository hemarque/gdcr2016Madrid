package org.gdcr.gameOfLife;

public class Cell {
	Neighbours neighbour = new Neighbours();
	boolean isAlive = true;

	public Cell(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Cell() {
	}

	public Neighbours getNeighbours() {
		return neighbour;
	}

	public void addNeighbour(Cell cell) {
		neighbour.add(cell);
	}

}
