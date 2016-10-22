package org.gdcr.gameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void init3Game() {
		String expectedBoard = "...\n...\n...\n";
		GameOfLife game = new GameOfLife(3, 3);
		String board = game.toString();
		assertEquals(expectedBoard, board);
	}

	@Test
	public void init4Game() {
		String expectedBoard = "....\n....\n....\n....\n";
		GameOfLife game = new GameOfLife(4, 4);
		String board = game.toString();
		assertEquals(expectedBoard, board);
	}

	@Test
	public void addCellTest() {
		String expectedBoard = "O..\n...\n...\n";
		GameOfLife game = new GameOfLife(3, 3);
		game.addCell(0, 0);
		assertEquals(expectedBoard, game.toString());
	}

	@Test
	public void addCellOutOfBoardTest() {
		String expectedBoard = "...\n...\n...\n";
		GameOfLife game = new GameOfLife(3, 3);
		game.addCell(4, 0);
		assertEquals(expectedBoard, game.toString());
	}

	@Test
	public void addCellOutOfBoard() {
		String expectedBoard = "...\n...\n...\n";
		GameOfLife game = new GameOfLife(3, 3);
		game.addCell(3, 0);
		assertEquals(expectedBoard, game.toString());
	}

	@Test
	public void getNumberOfNeighbours() throws Exception {
		int expectedNeighbours = 2;
		GameOfLife game = new GameOfLife(3, 3);
		game.addCell(1, 1);
		game.addCell(1, 2);
		game.addCell(2, 2);
		int neighbours = game.countNeighbours(1, 1);
		assertEquals(expectedNeighbours, neighbours);

	}

	@Test
	public void getNumberOfNeighboursTest() throws Exception {
		int expectedNeighbours = 1;
		GameOfLife game = new GameOfLife(3, 3);
		game.addCell(1, 1);
		game.addCell(1, 2);
		int neighbours = game.countNeighbours(1, 1);
		assertEquals(expectedNeighbours, neighbours);

	}

}
