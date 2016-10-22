package org.gdcr.gameOfLife;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void aCellWithLessThan2NeighboursDies() {
		Cell cell = new Cell();
		Neighbours neighbours = cell.getNeighbours();
		assertTrue(neighbours.count() < 2);
	}

	@Test
	public void aCellWith2or3NeighboursLives() {
		Cell cell = new Cell();
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		Neighbours neighbours = cell.getNeighbours();
		assertTrue(
				neighbours.count() >= 2 && neighbours.count() <= 3);
	}

	@Test
	public void aCellWithMoreThan3NeighboursDies() throws Exception {
		Cell cell = new Cell();
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		Neighbours neighbours = cell.getNeighbours();
		assertTrue(neighbours.count() > 3);
	}

	@Test
	public void aDeadCellWith3NeighboursLives() throws Exception {
		Cell cell = new Cell(false);
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		cell.addNeighbour(new Cell());
		Neighbours neighbours = cell.getNeighbours();
		assertTrue(neighbours.count() == 3);
	}

}
