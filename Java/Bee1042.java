/*Sort Simples
O programa deve ler 3 valores inteiros, e então ordena-los em ordem crescente.
No final, devem ser apresentados os valores novamente, na ordem em que foram inseridos.
v.hofmeister@edu.pucrs.br
04/04/2022
*/

import java.util.Scanner;

public class Sort{ // Trocar para Main para o Bee
	public static void main(String args[]){
		Scanner leitor;
		int a;
		int b;
		int c;

		System.out.println("Sort Simples"); // Retirar para o Bee
		System.out.println("Insira 3 valores a serem ordenados"); // Retirar para o Bee

		leitor = new Scanner(System.in);
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();

		if (a < b && b < c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

		if (a < b && b > c && a < c){
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}

		if (a > b && a < c){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}

		if (a > b && a > c && b < c){
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}

		if (a < b && b > c && a > c){
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}

		if (a > b && b > c){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}

		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}