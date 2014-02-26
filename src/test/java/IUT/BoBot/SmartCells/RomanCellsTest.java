package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanCellsTest {
		RomanCells cell = new RomanCells();
	
	@Test
	public void testX() {
		assertEquals("10", cell.ask("X"));
	}

}
