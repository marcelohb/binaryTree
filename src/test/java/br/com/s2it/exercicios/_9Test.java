package br.com.s2it.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class _9Test {
	
	_9 minhaArvore;
	ARVORE arvore;
	
	@Before
	public void setUp() {
		arvore = new ARVORE();
		minhaArvore = new _9();
	}

	@Test
	public void somarUmElemento() {
		minhaArvore.inserir(arvore, 10);
		assertEquals(10, minhaArvore.somarNo(arvore));
		assertEquals(0, minhaArvore.somarNo(arvore.esquerda));
		assertEquals(10, minhaArvore.somarNo(arvore.direita));
	}
	
	@Test
	public void somarDois() {
		minhaArvore.inserir(arvore, 6);
		minhaArvore.inserir(arvore, 1);
		minhaArvore.inserir(arvore, 9);
		minhaArvore.inserir(arvore, 21);
		assertEquals(37, minhaArvore.somarNo(arvore));
	}

}
