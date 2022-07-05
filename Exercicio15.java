package DeverDeFunção;

import java.util.Scanner;

public class Exercicio15 {
	static boolean primo(int n){
		if(n%3 != 0 && n%2 != 0 && n%7 !=  0&& n%5 != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o numero: ");
		int a= teclado.nextInt();
		if(primo(a)==true) {
			System.out.print("Ele é primo.");
		}else {
			System.out.print("Ele não é primo.");
		}
	}
}
