package DeverDeFunção;

import java.util.Scanner;

public class Exercicio01 {
	static void positivo(int n) {
		if (n<0) {
			System.out.print("Negaivo");
		}else {
			System.out.print("Positivo");
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int n= teclado.nextInt();
		positivo(n);
	}

}
