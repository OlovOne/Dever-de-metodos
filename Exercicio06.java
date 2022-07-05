package DeverDeFunção;

import java.util.Scanner;

public class Exercicio06 {
	static int maior(int n, int n1) {
		if(n>n1) {
			return (int) n;
		}else {
			return (int) n1;
		}
	}
	static int maior(int n,int n1,int n2) {
		return maior(maior(n,n1),n2);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int n= teclado.nextInt();
		System.out.print("Informe outro numero: ");
		int n1= teclado.nextInt();
		System.out.print("Informe outro numero: ");
		int n2= teclado.nextInt();
		System.out.print(maior(n,n1,n2));
	}

}