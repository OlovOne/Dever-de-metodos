package DeverDeFun��o;

import java.util.Scanner;

public class Exercicio07 { 
	static int raiz1(int a,int b, int tri) {
		return (int) ((-b+(Math.sqrt(tri)))/(2*a));
	}
	static int raiz2(int a,int b, int tri) {
		return (int) ((-b-(Math.sqrt(tri)))/(2*a));
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o a, b e c, repscivamente.");
		int a= teclado.nextInt();
		int b= teclado.nextInt();
		int c= teclado.nextInt();
		int tri = (-b*-b)-(4*a*c);
		if(tri == 0) {
			System.out.println("n�o tem raiz.");
		}else {
			System.out.println("� Raiz 1 � "+raiz1(a,b,tri)+"\n"+"� Raiz 2 � "+raiz2(a,b,tri));
		}
	}

}
