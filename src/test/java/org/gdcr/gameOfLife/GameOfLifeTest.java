package org.gdcr.gameOfLife;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void aliveCellWithLessThanTwoNeighboursDies() {
		int neighbours = 1;
		Cell cell = new Cell(neighbours, true);
		Cell nextGeneration = cell.nextIteration();
		assertFalse(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithTwoNeighboursIsAlive() {
		int neighbours = 2;
		Cell cell = new Cell(neighbours, true);
		Cell nextGeneration = cell.nextIteration();
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithThreeNeighboursIsAlive()
			throws Exception {
		int neighbours = 3;
		Cell cell = new Cell(neighbours, true);
		Cell nextGeneration = cell.nextIteration();
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithMoreThanThreeNeighboursIsDead()
			throws Exception {
		int neighbours = 4;
		Cell cell = new Cell(neighbours, true);
		Cell nextGeneration = cell.nextIteration();
		assertFalse(nextGeneration.isAlive());
	}

	@Test
	public void deadCellWithThreeNeighboursIsAlive()
			throws Exception {
		int neighbours = 3;
		Cell cell = new Cell(neighbours, false);
		Cell nextGeneration = cell.nextIteration();
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void deadCellWithTwoNeighboursIsDead() throws Exception {
		int neighbours = 2;
		Cell cell = new Cell(neighbours, false);
		Cell nextGeneration = cell.nextIteration();
		assertFalse(nextGeneration.isAlive());
	}

}
