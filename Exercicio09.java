package DeverDeFunção;

import java.util.Scanner;

public class Exercicio09 {
	static int fatorial(int n) {
		int r = 1;
		for(int i = 1;i<n;i++) {
			r = i*n;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero a  ser fatorado: ");
		int a= teclado.nextInt();
		System.out.print("O fatorial é: "+fatorial(a));
	}

}
