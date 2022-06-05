/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos
de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive
ambos se for o caso.

v.hofmeister@edu.pucrs.br
30/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Multiplos13{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int x, y, maior, menor, soma;

		teclado = new Scanner(System.in);
		x = teclado.nextInt();
		y = teclado.nextInt();
		teclado.close();

		menor = 0;
		maior = 0;

		if (x <= y){
			menor = x;
			maior = y;
		} else {
			menor = y;
			maior = x;
		}

		soma = 0;

		for (int n = menor; n <= maior; n++){
			if (n % 13 != 0){
				soma += n;
			}
		}

		System.out.println(soma);
	}
}