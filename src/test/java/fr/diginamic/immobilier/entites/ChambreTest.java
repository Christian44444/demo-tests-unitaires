package fr.diginamic.immobilier.entites;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChambreTest {

	@Test
	public void testChambreTest1() {
		String resultat = "";
		Piece c1 = new Chambre(1, 15);
		resultat = c1.getType();
		assertEquals(Piece.TYPE_CHAMBRE, resultat);
	}
	@Test
	public void testChambreTest2() {
		String resultat = "";
		Piece c1 = new Chambre(1, 15.4);
		resultat = c1.getType();
		assertNotEquals(Piece.TYPE_CUISINE, resultat);
	}
	@Test
	public void testChambreTest3() {
		double resultat = 0.0;
		Piece c1 = new Chambre(1, 15);
		resultat = c1.getSuperficie();
		assertEquals(15.0, resultat,0.001);
	}
	

}
