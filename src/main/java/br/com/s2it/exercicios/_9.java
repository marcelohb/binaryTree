package br.com.s2it.exercicios;

public class _9 {

	private ARVORE raiz;
    private int somaDosNos = 0;
	
	public ARVORE inserir(ARVORE arvore, int numero) {
		if (arvore == null) {
			arvore = new ARVORE();
			arvore.numero = numero;
			arvore.esquerda = null;
			arvore.direita = null;
		} else if (numero < arvore.numero) {
			arvore.esquerda = inserir(arvore.esquerda, numero);
		} else {
			arvore.direita = inserir(arvore.direita, numero);
		}

		return arvore;
	}
	
	public int somarNo(ARVORE arvore) {
        if (arvore == null) {
            return 0;
        }

        if (arvore == raiz) {
            somaDosNos = somarNo(arvore.esquerda)
                    + somarNo(arvore.direita);
        } else {
            somaDosNos = somarNo(arvore.esquerda)
                    + somarNo(arvore.direita)
                    + arvore.numero;
        }

        return somaDosNos;

    }
}
