/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

v.hofmeister@edu.pucrs.br
03/05/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class FatorialSimples{

	public static int fatorial(int n){
		int resultado = n;
		for (int i = n - 1; i >= 1; i--){
			resultado *= i;
		}

		return resultado;
	}

	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n, resultado;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();
		teclado.close();
		resultado = fatorial(n);

		System.out.println(resultado);
	}
}