package DeverDeFunção;

import java.util.Scanner;

public class Exercicio02 {
	static int quadrado(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int n= teclado.nextInt();
		System.out.println(quadrado(n));
	}

}