/*Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class ImparesConsecutivos2{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n, x, y, maior, menor, i, soma;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();
		soma = 0;

		for (int cont = 1; cont <= n; cont++){
			x = teclado.nextInt();
			y = teclado.nextInt();
			soma = 0;

			if (x < y){
				menor = x;
				maior = y;
			} else {
				menor = y;
				maior = x;
			}

			i = menor + 1;

			while (i > menor && i < maior){
				if (i % 2 != 0){
					soma += i;
				}

				i++;
			}
			System.out.println(soma);
		}

		teclado.close();

	}
}