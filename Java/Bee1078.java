/* Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.

v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Tabuada{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n, resultado;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();
		teclado.close();

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
			resultado = n * multiplicador;

			System.out.println(multiplicador + " x " + n + " = " + resultado);
		}
	}
} 