package br.com.s2it.exercicios;

public class _8 {
	
	private static Integer C;

	public static int calcular(Integer a, Integer b) {
		char[] numeroA = new char[0], numeroB = new char[0];
		int maiorTamanho;
		String numeroC = "";
		
		if (a != null)
			numeroA = a.toString().toCharArray();
		if (b != null)
			numeroB = b.toString().toCharArray();
		
		maiorTamanho = (numeroA.length > numeroB.length) ? numeroA.length : numeroB.length;
			
		for (int i = 0; i < maiorTamanho; i++) {
			if (numeroA.length > 0 && numeroA.length > i) {
				numeroC += String.valueOf(numeroA[i]);
			}
			if (numeroB.length > 0 && numeroB.length > i) {
				numeroC += String.valueOf(numeroB[i]);
			}
		}
		
		try {
			C = Integer.valueOf(numeroC);
		} catch (Exception e) {
			return 0;
		}
		
		if (C > 1000000)
			return -1;
		return C;
	}

}
