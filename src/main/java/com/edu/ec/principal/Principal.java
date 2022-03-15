package com.edu.ec.principal;

public class Principal {

	public static void main(String[] args) {
		ClaseColor rojo = new ClaseColor(255, 0, 0);
		ClaseColor verde = new ClaseColor(0, 255, 0);
		
		ClaseColor resultado = new ClaseColor(255, 255, 0);
		
		System.out.println(rojo.combinarColores(verde).toString());
		
		System.out.println(resultado.toString());
		
	}
}
