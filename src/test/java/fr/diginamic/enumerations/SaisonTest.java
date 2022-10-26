package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testvalueOfLibelle( ) {
		
		Saison resultat = Saison.valueOfLibelle("Printemps");
		
		assertEquals(Saison.PRINTEMPS, resultat);
		
	}
	@Test
	public void testvalueOfLibelle2( ) {
		
		Saison resultat = Saison.valueOfLibelle("Eté");
		
		assertEquals(Saison.ETE, resultat);
		
	}
	@Test
	public void testvalueOfLibelleNull( ) {
		
		Saison resultat = Saison.valueOfLibelle(null);
		
		assertNull(resultat);
		
	}

	
}
