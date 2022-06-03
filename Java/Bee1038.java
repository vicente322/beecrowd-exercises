/*Lanche
O programa deve ler dois valores inteiros, o primeiro é o código de produtos, o segundo é a quantidade
O programa deve calcular o valor com base no item e sua quantidade
v.hofmeister@edu.pucrs
28/03/2022
*/

import java.util.Scanner;

public class Lanche{ //Mudar classe para Main para o Bee
	public static void main(String args[]){
		Scanner leitor;
		int codigo;
		int quantidade;
		double valor;
		double total;

		System.out.println("LANCHE!"); //Retirar para o Bee
		System.out.println("Insira o código do produto e a quantidade"); //Retirar para o Bee

		leitor = new Scanner(System.in);
		codigo = leitor.nextInt();
		quantidade = leitor.nextInt();

		if (codigo == 1){
			valor = 4.00;
			total = valor * quantidade;
			System.out.println("Cachorro quente");//Retirar para o Bee
			System.out.printf("Total: R$ %.2f\n", total);
		}
		
		if (codigo == 2){
			valor = 4.50;
			total = valor * quantidade;
			System.out.println("X-Salada");//Retirar para o Bee
			System.out.printf("Total: R$ %.2f\n", total);
		}

		if (codigo == 3){
			valor = 5.00;
			total = valor * quantidade;
			System.out.println("X-Bacon");//Retirar para o Bee
			System.out.printf("Total: R$ %.2f\n", total);
		}

		if (codigo == 4){
			valor = 2.00;
			total = valor * quantidade;
			System.out.println("Torrada simples");//Retirar para o Bee
			System.out.printf("Total: R$ %.2f\n", total);
		}

		if (codigo == 5){
			valor = 1.50;
			total = valor * quantidade;
			System.out.println("Refrigerante");//Retirar para o Bee
			System.out.printf("Total: R$ %.2f\n", total);
		}
	}
}