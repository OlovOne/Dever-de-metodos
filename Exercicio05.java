package DeverDeFunção;

import java.util.Scanner;

public class Exercicio05 {
	static int maior(int n, int n1) {
		if(n>n1) {
			return (int) n;
		}else {
			return (int) n1;
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int n= teclado.nextInt();
		System.out.print("Informe outro numero: ");
		int n1= teclado.nextInt();
		System.out.println(maior(n,n1));
	}
}