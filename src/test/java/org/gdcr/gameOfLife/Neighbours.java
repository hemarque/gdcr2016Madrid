package org.gdcr.gameOfLife;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Neighbours {
	private List<Cell> neighbours;

	public int count() {
		int count = 0;
		for (Cell c : this.neighbours) {
			if (c.isAlive) {
				count++;
			}
		}
	}

	public void add(Cell cell) {
		count++;
	}

}
