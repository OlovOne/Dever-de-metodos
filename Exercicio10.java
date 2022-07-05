package DeverDeFunção;

import java.util.Scanner;

public class Exercicio10 {
	static void triangulo(int n, char a) {
		for(int i = 0;i<n;i++) {
			System.out.println("");
			for(int j = 0;j<i;j++) {
				System.out.print(a);
			}
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de linhas: ");
		int a= teclado.nextInt();
		System.out.print("Informe o caracter a ser imprimido: ");
		char b = teclado.next().charAt(0);
		triangulo(a,b);
	}
}
