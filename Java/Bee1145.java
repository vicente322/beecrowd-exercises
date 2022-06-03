/*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número,
conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.

v.hofmeister@edu.pucrs.br
01/05/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class SequenciaLogica2{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int x, y, n, contador;

		teclado = new Scanner(System.in);
		x = teclado.nextInt();
		y = teclado.nextInt();
		teclado.close();
		n = 1;

		while (n <= y){

			contador = 1;

			while (contador <= x){
				if (contador < x){
					System.out.printf("%d ", n);
				} else {
					System.out.printf("%d\n", n);
				}

				n++;
				contador++;
			}
		}
	}
}