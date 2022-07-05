package DeverDeFunção;

import java.util.Scanner;

public class Exercicio08 {
	static int potencia(int n,int n1) {
		int r = 1;
		for(int i = 0;i<n1;i++) {
			r=r*n; 
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a base: ");
		int a= teclado.nextInt();
		System.out.print("Informe o expoente: ");
		int b= teclado.nextInt();
		System.out.println("A resposta é: "+potencia(a,b));
	}

}