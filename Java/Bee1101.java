/*Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).
Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class SomaSequencia{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int m, n, menor, maior, soma;

		teclado = new Scanner(System.in);
		menor = 0;
		maior = 0;

		while(true){
			m = teclado.nextInt();
			n = teclado.nextInt();
			soma = 0;

			if (m <= 0 || n <= 0){
				
				break;

			} else {

				if (m < n){
					menor = m;
					maior = n;
				} else {
					menor = n;
					maior = m;
				}

				for (int i = menor; i <= maior; i++){
					System.out.printf("%d ", i);
					soma += i;
				}

				System.out.printf("Sum=%d\n", soma);
			}
		}
	}
}