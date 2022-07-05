package DeverDeFunção;

import java.util.Scanner;

public class Exercicio12 {
	static void contador(int n, int n1) {
		if(n>n1) {
			for (int i = n1 ;i<=n;i++) {
				System.out.println(i);
			}
		}else {
			for (int i = n ;i<=n1;i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int a= teclado.nextInt();
		System.out.print("Informe o numero: ");
		int b= teclado.nextInt();
		contador(a,b);
	}

}
