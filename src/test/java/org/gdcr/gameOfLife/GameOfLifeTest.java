package org.gdcr.gameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void initGame() {
		String expectedBoard = "...\n...\n...\n";
		GameOfLife game = new GameOfLife(3, 3);
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

}
