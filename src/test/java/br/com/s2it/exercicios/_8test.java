package br.com.s2it.exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class _8test {
	
	private Integer A = 149;
	private Integer B = 832;
	private Integer C;

	@Test
	public void numeroCmaiorQue1000000() {
		A = 1000000;
		C = _8.calcular(A, B);
		assertEquals(Integer.valueOf(-1), C);
	}
	
	@Test
	public void primeiroCaracterDeA() {
		C = _8.calcular(A, B);
		assertEquals("1", C.toString().substring(0, 1));
	}
	
	@Test
	public void segundoCaracterDeB() {
		C = _8.calcular(A, B);
		assertEquals("8", C.toString().substring(1, 2));
	}
	
	@Test
	public void numeroBVazio() {
		B = null;
		C = _8.calcular(A, B);
		assertEquals(Integer.valueOf(149), C);
	}
	
	@Test
	public void numeroAVazio() {
		A = null;
		C = _8.calcular(A, B);
		assertEquals(Integer.valueOf(832), C);
	}
	
	@Test
	public void numeroAMaior( ) {
		A = 123456;
		C = _8.calcular(A, B);
		assertEquals(Integer.valueOf(182332456), C);
	}
	
	@Test
	public void numeroBMaior( ) {
		B = 123456;
		C = _8.calcular(A, B);
		assertEquals(Integer.valueOf(114293456), C);
	}

}
