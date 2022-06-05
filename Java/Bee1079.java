/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class MediaPonderada{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n;
		double valor1, valor2, valor3, media;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++){
			valor1 = teclado.nextDouble();
			valor2 = teclado.nextDouble();
			valor3 = teclado.nextDouble();
			media = ((2 * valor1) + (3 * valor2) + (5 * valor3)) / 10.0;

			System.out.printf("%.1f\n", media);
		}
	}
}