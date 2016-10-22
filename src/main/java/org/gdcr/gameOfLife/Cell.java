package org.gdcr.gameOfLife;

import java.util.HashMap;

public class Cell {
	private boolean isAlive;

	public Cell(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Cell nextIteration(int neighbours) {
		try {
			HashMap<Integer, Boolean> diccionario = new HashMap<Integer, Boolean>();
			diccionario.put(2, isAlive);
			diccionario.put(3, true);
			this.isAlive = (Boolean) diccionario.get(neighbours);
		} catch (Exception e) {
			this.isAlive = false;
		}
		return this;
	}

	public boolean isAlive() {
		return this.isAlive;
	}

}
