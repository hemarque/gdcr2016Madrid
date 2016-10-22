package org.gdcr.gameOfLife;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void aliveCellWithLessThanTwoNeighboursDies() {
		int neighbours = 1;
		boolean isAlive = true;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertFalse(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithTwoNeighboursIsAlive() {
		int neighbours = 2;
		boolean isAlive = true;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithThreeNeighboursIsAlive()
			throws Exception {
		int neighbours = 3;
		boolean isAlive = true;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void aliveCellWithMoreThanThreeNeighboursIsDead()
			throws Exception {
		int neighbours = 4;
		boolean isAlive = true;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertFalse(nextGeneration.isAlive());
	}

	@Test
	public void deadCellWithThreeNeighboursIsAlive()
			throws Exception {
		int neighbours = 3;
		boolean isAlive = false;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertTrue(nextGeneration.isAlive());
	}

	@Test
	public void deadCellWithTwoNeighboursIsDead() throws Exception {
		int neighbours = 2;
		boolean isAlive = false;
		Cell cell = new Cell(isAlive);
		Cell nextGeneration = cell.nextIteration(neighbours);
		assertFalse(nextGeneration.isAlive());
	}

	@Test
	public void a_position_with_no_neightbours_has_0_neighbours() {
		Board board = new Board(3, 3);

		assertEquals(0, board.getVecinos(1, 1));
	}

	@Test
	public void a_position_with_one_neightbours_has_1_neighbours() {
		Board board = new Board(3, 3);
		board.populate(0, 1);

		assertEquals(1, board.getVecinos(1, 1));
	}
}
