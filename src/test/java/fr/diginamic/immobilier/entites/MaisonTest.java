package fr.diginamic.immobilier.entites;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPiece1() {
		Maison m1 = new Maison();
		Piece c1 = new Chambre(1, 15.4);
		Piece[] resultat = new Piece[1];
		resultat[0] = c1;
		m1.ajouterPiece(c1);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}
	@Test
	public void testAjouterPiece2() {
		Maison m1 = new Maison();
		Piece c1 = new Salon(1, 15.4);
		Piece[] resultat = new Piece[1];
		resultat[0] = c1;
		m1.ajouterPiece(c1);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}

	@Test
	public void testAjouterPiece3() {
		Maison m1 = new Maison();
		Piece c1 = new Cuisine(1, 15.4);
		Piece[] resultat = new Piece[1];
		resultat[0] = c1;
		m1.ajouterPiece(c1);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}
	@Test
	public void testAjouterPiece4() {
		Maison m1 = new Maison();
		Piece c1 = new WC(1, 15.4);
		Piece[] resultat = new Piece[1];
		resultat[0] = c1;
		m1.ajouterPiece(c1);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}
	@Test
	public void testAjouterPiece5() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece[] resultat = new Piece[1];
		resultat[0] = c1;
		m1.ajouterPiece(c1);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}
	
	@Test
	public void testAjouterPieceNull() {
		Maison m1 = new Maison();
		Piece[] resultat = new Piece[0];
		
		m1.ajouterPiece(null);
		
		assertArrayEquals(m1.getPieces(),resultat);
	}
	@Test
	public void testNbPieces1() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		Piece c3 = new Salon(0, 20.4);
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		m1.ajouterPiece(c3);
		
		assertEquals(m1.nbPieces(),3);
	}
	@Test
	public void testNbPieces2() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		
		assertEquals(m1.nbPieces(),2);
	}
	
	@Test
	public void testSuperficieEtage1() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		
		assertEquals(m1.superficieEtage(2),0,0.001);
	}
	@Test
	public void testSuperficieEtage2() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		Piece c3 = new Salon(0, 20.4);
		
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		m1.ajouterPiece(c3);
		
		assertEquals(m1.superficieEtage(0),40.8,0.001);
	}

	@Test
	public void testSuperficieTypePiece1() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		Piece c3 = new Salon(0, 20.4);
		Piece c4 = new Salon(1, 15.4);
		
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		m1.ajouterPiece(c3);
		m1.ajouterPiece(c4);
		
		assertEquals(m1.superficieTypePiece(Piece.TYPE_SALON),35.8,0.001);
	}
	@Test
	public void testSuperficieTypePiece2() {
		Maison m1 = new Maison();
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.4);
		Piece c3 = new Salon(0, 20.4);
		Piece c4 = new Salon(1, 15.4);
		Piece c5 = new SalleDeBain(0, 15.4);
		
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		m1.ajouterPiece(c3);
		m1.ajouterPiece(c4);
		m1.ajouterPiece(c5);
		
		assertEquals(m1.superficieTypePiece(Piece.TYPE_SDB),30.8,0.001);
	}
	@Test
	public void testSuperficieTypePiece3() {
		Maison m1 = new Maison();
		
		assertEquals(m1.superficieTypePiece(Piece.TYPE_SDB),0,0.001);
	}
	@Test
	public void testSuperficieTypePiece4() {
		Maison m1 = new Maison();
		
		assertEquals(m1.superficieTypePiece(""),0,0.001);
	}
	@Test
	public void testSuperficieTypePiece5() {
		Maison m1 = new Maison();
		
		assertEquals(m1.superficieTypePiece(null),0,0.001);
	}
	
	@Test
	public void testCalculerSurface1() {
		Maison m1 = new Maison();
		
		assertEquals(m1.calculerSurface(),0,0.001);
	}
	@Test
	public void testCalculerSurface2() {
		Maison m1 = new Maison();
		
		Piece c1 = new SalleDeBain(1, 15.4);
		Piece c2 = new Cuisine(0, 20.6);
		Piece c3 = new Salon(0, 20.4);
		Piece c4 = new Salon(1, 15.6);
		Piece c5 = new SalleDeBain(0, 15.3);
		
		m1.ajouterPiece(c1);
		m1.ajouterPiece(c2);
		m1.ajouterPiece(c3);
		m1.ajouterPiece(c4);
		m1.ajouterPiece(c5);
	
		assertEquals(m1.calculerSurface(),87,3.001);
	}
	
	
	
}
