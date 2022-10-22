//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

package exercicios_while;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante ");
			}
			else if (x > 0 && y > 0) {
				System.out.println("Segundo quadrante ");
			}
			else if (x > 0 && y > 0) {
				System.out.println("Terceiro quadrante ");
			}
			else {
				System.out.println("Quarto quadrante ");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("Programa encerrado" ); //Mesmo o programa pedindo para nao colocar mensagem de encerramento, coloquei para ficar mais completo.
		
		
		sc.close();
	}

}
