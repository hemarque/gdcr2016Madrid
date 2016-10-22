package org.gdcr.gameOfLife;

import java.util.HashMap;

public class Cell {

	private int neighbours;

	public Cell(int neighbours) {
		this.neighbours = neighbours;
	}

	public Cell nextIteration() {
		return this;
	}

	public boolean isAlive() {
		try {
			HashMap diccionario = new HashMap();
			diccionario.put(2, true);
			diccionario.put(3, true);
			return (Boolean) diccionario.get(this.neighbours);
		} catch (Exception e) {
			return false;
		}
	}

}
