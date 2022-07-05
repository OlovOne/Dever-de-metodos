package DeverDeFunção;

import java.util.Scanner;

public class Exercicio14 {
	static float media(float n,float n1, float n2, float n3) {
		return (n*n1)+(n2*n3)/(n1+n3);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a nota: ");
		float a= teclado.nextInt();
		System.out.print("Informe o peso da nota: ");
		float b= teclado.nextInt();
		System.out.print("Informe a nota: ");
		float c= teclado.nextInt();
		System.out.print("Informe o peso da nota ");
		float d= teclado.nextInt();
		System.out.print("Informe a media ponderada do aluno é:"+media(a,b,c,d));
	}

}
