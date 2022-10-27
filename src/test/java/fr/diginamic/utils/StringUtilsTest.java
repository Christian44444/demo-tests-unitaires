package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void levenshteinDistancetest1() {
		int resultat;
		resultat = StringUtils.levenshteinDistance("chien", "chine");
		
		assertEquals( 2, resultat);
	}
	@Test
	public void levenshteinDistancetest2() {
		int resultat;
		resultat = StringUtils.levenshteinDistance("chat", "chats");
		
		assertEquals( 1, resultat);
	}
	@Test
	public void levenshteinDistancetestnull() {
		int resultat;
		resultat = StringUtils.levenshteinDistance(null, "chine");
		
		assertEquals( 0, resultat);
	}

}
