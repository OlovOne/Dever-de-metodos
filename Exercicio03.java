package DeverDeFunção;

import java.util.Scanner;

public class Exercicio03 {
	static boolean vogal(char a) {
		if (a =='o'||a == 'i'||a == 'e'||a == 'u'||a == 'a') {
			return true;
	}else {
		return false;
	}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a letra: ");
		char a= teclado.next().charAt(0);
		if (vogal(a) == true) {
			System.out.println("E uma vogal");
		}else {
			System.out.println("Não e uma vogal");
		}
		
	}

}