package org.gdcr.gameOfLife;

import java.util.HashMap;

public class Cell {

	private int neighbours;
	private boolean isAlive;

	public Cell(int neighbours, boolean isAlive) {
		this.neighbours = neighbours;
		this.isAlive = isAlive;
	}

	public Cell nextIteration() {
		try {
			HashMap<Integer, Boolean> diccionario = new HashMap<Integer, Boolean>();
			diccionario.put(2, isAlive);
			diccionario.put(3, true);
			this.isAlive = (Boolean) diccionario.get(this.neighbours);
		} catch (Exception e) {
			this.isAlive = false;
		}
		return this;
	}

	public boolean isAlive() {
		return this.isAlive;
	}

}
