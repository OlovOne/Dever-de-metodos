package DeverDeFunção;

import java.util.Scanner;

public class Exercicio04 {
	static int absolute(int n) {
		if(n<0) {
			return n*-1;
		}else
			return n;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int n= teclado.nextInt();
		System.out.println(absolute(n));
	}

}