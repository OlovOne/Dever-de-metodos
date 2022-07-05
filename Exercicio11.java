package DeverDeFunção;

import java.util.Scanner;

public class Exercicio11 {
	static void bi(int n) {
		if(n%4 ==0 && n%100 !=0 || n%400 == 0) {
			System.out.print("E bissexto");
		}else {
			System.out.print("Não e bissexto");
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int a= teclado.nextInt();
		bi(a);
	}
}
