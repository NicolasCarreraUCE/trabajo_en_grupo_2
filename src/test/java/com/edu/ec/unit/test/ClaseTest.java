package com.edu.ec.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.ec.principal.ClaseColor;

public class ClaseTest {

	@Test
	public void testCombinarColores() {
		ClaseColor rojo = new ClaseColor(255, 0, 0);
		ClaseColor verde = new ClaseColor(0, 255, 0);
		
		ClaseColor resultado = new ClaseColor(255, 255, 0);
		
		assertTrue(rojo.combinarColores(verde).equals(resultado));
	}
	
}
