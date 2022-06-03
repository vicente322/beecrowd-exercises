/*Coordenadas de um Ponto
O programa deve receber dois valores com uma casa decimal que devem representar as coordenadas de um ponto (x, y)
Em seguida, deve ser determinado a qual quadrante o ponto pertence, ou se esta sobre um dos eixos ou na origem
v.hofmeister@edu.pucrs.br
29/03/2022
*/

import java.util.Scanner;

public class CoordenadasPonto{ //Mudar para Main no Bee
	public static void main(String args[]){
		Scanner leitor;
		double x;
		double y;

		System.out.println("COORDENADAS DE UM PONTO"); //Retirar para o Bee
		System.out.println("Digite o X e o Y do ponto"); //Retirar para o Bee

		leitor = new Scanner(System.in);
		x = leitor.nextDouble();
		y = leitor.nextDouble();

		if (x == 0.0 && y == 0.0){
			System.out.println("Origem");
		}

		if (x == 0.0 && y != 0.0){
			System.out.println("Eixo Y");
		}

		if (x != 0.0 && y == 0.0){
			System.out.println("Eixo X");
		}

		if (x > 0.0 && y > 0.0){
			System.out.println("Q1");
		}

		if (x < 0.0 && y > 0.0){
			System.out.println("Q2");
		}

		if (x < 0.0 && y < 0.0){
			System.out.println("Q3");
		}

		if (x > 0.0 && y < 0.0){
			System.out.println("Q4");
		}
	}
}