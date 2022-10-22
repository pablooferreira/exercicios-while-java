//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

package exercicios_while;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("O numeral 1 significa Álcool ");
		System.out.println("O numeral 2 significa Gasolina ");
		System.out.println("O numeral 3 significa Diesel ");
		System.out.println("O numeral 4 encerra a pesquisa. ");
		System.out.println();
		
		System.out.println("Digite o combustível de sua preferência: ");
		int x = sc.nextInt();
		
		while (x != 4) {
			if (x > 4 || x <= 0) {
				System.out.println("Digite um COD. válido! ");
			}
			else if (x == 1) {
				alcool += 1;
			}
			else if (x == 2) {
				gasolina += 1;
			}
			else {
				diesel += 1;
			}
			System.out.println("Digite o outro valor: ");
			x = sc.nextInt();
		}
		System.out.println("Muito obrigado");
		System.out.println("Álcool - " + alcool);
		System.out.println("Gasolina - " + gasolina);
		System.out.println("Diesel - " + diesel);
		
		
		sc.close();

	}

}
