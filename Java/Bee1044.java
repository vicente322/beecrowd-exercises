/*Multiplos
O programa deve receber dois valores inteiros e conferir se estes são multiplos.
Caso sejam, deve dar saida "Sao Multiplos"
Caso não sejam, deve dar saida "Nao sao Multiplos"
v.hofmeister@edu.purcrs.br
05/04/2022
*/

import java.util.Scanner;

public class Multiplos{ //Trocar classe para Main para o Bee
	public static void main (String args[]){
		Scanner leitor;
		int valor1;
		int valor2;

		System.out.println("Multiplos");// Retirar para o Bee
		System.out.println("Insira dois valores para checar se são Multiplos!");// Retirar para o Bee

		leitor = new Scanner(System.in);
		valor1 = leitor.nextInt();
		valor2 = leitor.nextInt();

		if (valor1 < valor2){
			if (valor2 % valor1 == 0){
				System.out.println("Sao Multiplos");
			}
			else{
				System.out.println("Nao sao Multiplos");
			}
		}
		else{
			if (valor1 % valor2 == 0){
				System.out.println("Sao Multiplos");
			}
			else{
				System.out.println("Nao sao Multiplos");
			}
		}
	}
}