/*Tipos Triangulos
O programa deve receber três pontos flutuantes, ordenalos em ordem decrescente, de forma que A seja o maior valor.
A seguir, o programa deve determinar que tipo de triangulo os três lados formam.
v.hofmeister@edu.pucrs.br
13/04/2022
*/

import java.util.Scanner;

public class Triangulos{//Trocar nome da classe para o Bee
	public static void main(String args[]){
		Scanner teclado;
		double valor1;
		double valor2;
		double valor3;
		double a;
		double b;
		double c;

		System.out.println("Tipos de Triangulos");//Retirar para o Bee
		System.out.println("Insira os valores dos 3 lados");//Retirar para o Bee

		teclado = new Scanner(System.in);
		valor1 = teclado.nextDouble();
		valor2 = teclado.nextDouble();
		valor3 = teclado.nextDouble();
		a = 0.0;
		b = 0.0;
		c = 0.0;

		if (valor1 >= valor2 && valor2 >= valor3){
			a = valor1;
			b = valor2;
			c = valor3;
		}

		if (valor1 >= valor3 && valor3 >= valor2){
			a = valor1;
			b = valor3;
			c = valor2;
		}

		if (valor2 >= valor1 && valor1 >= valor3){
			a = valor2;
			b = valor1;
			c = valor3;
		}

		if (valor2 >= valor3 && valor3 >= valor1){
			a = valor2;
			b = valor3;
			c = valor1;
		}

		if (valor3 >= valor1 && valor1 >= valor2){
			a = valor3;
			b = valor1;
			c = valor2;
		}

		if (valor3 > valor2 && valor2 > valor1){
			a = valor3;
			b = valor2;
			c = valor1;
		}

		System.out.printf("Lado A = %.1f \nLado B = %.1f \nLado C = %.1f \n\n", a, b, c); //Retirar para o Bee

		if (a >= b + c){
			System.out.println("NAO FORMA TRIANGULO");
		}
		else{

			if (Math.pow(a, 2.0) == Math.pow(b,2.0) + Math.pow(c,2.0)){
				System.out.println("TRIANGULO RETANGULO");
			}

			if (Math.pow(a, 2.0) > Math.pow(b, 2.0) + Math.pow(c, 2.0)){
				System.out.println("TRIANGULO OBTUSANGULO");
			}

			if (Math.pow(a, 2.0) < Math.pow(b, 2.0) + Math.pow(c, 2.0)){
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (a == b && b == c && c == a){
				System.out.println("TRIANGULO EQUILATERO");
			}
			else{
				if (a != b && b != c && c != a){

				}
				else{
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
	}
}