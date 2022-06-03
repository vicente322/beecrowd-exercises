/*Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo
resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em
ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

v.hofmeister@edu.pucrs.br
30/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class RestoDivisao{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int x, y, menor, maior;

		teclado = new Scanner(System.in);
		menor = 0;
		maior = 0;
		x = teclado.nextInt();
		y = teclado.nextInt();
		teclado.close();

		if (x <= y){
			menor = x;
			maior = y;
		} else {
			menor = y;
			maior = x;
		}

		for (int n = menor + 1; n < maior; n++){
			if (n % 5 == 2 || n % 5 == 3){
				System.out.println(n);
			}
		}
	}
}