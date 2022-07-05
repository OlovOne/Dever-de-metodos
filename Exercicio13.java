package DeverDeFunção;

import java.util.Scanner;

public class Exercicio13 {
	static int contador(int n, int n1) {
		int p=0,j=0;
		if(n>n1) {
			for (int i = n1 ;i<=n;i++) {
				if(i%2 == 0) {
					p +=i;
				}
			}
			return p;
		}else {
			for (int i = n ;i<=n1;i++) {
				if(i%2 == 0) {
					j+=i;
				}
			}
			return j;
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int a= teclado.nextInt();
		System.out.print("Informe o numero: ");
		int b= teclado.nextInt();
		System.out.print("A soma dos numeros pares dentro do intervalo informado é: "+contador(a,b));
	}

}