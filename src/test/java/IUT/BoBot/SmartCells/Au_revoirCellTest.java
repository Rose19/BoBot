package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class Au_revoirCellTest {

	Au_revoirCell cell = new Au_revoirCell();

	@Test
	public void testAu_revoir() {
		assertEquals("au revoir", cell.ask("au revoir"));
	}
	
	@Test
	public void testNotAu_revoir() {
		assertEquals(null, cell.ask("salut"));
	}

}