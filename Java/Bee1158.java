/*Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso
de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos
a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.

v.hofmeister@edu.pucrs.br
04/05/2022
*/
import java.util.Scanner;

public class ImparesConsecutivo{
	public static boolean Impar(int numero){
		boolean resultado = numero % 2 != 0;

		return resultado;
	}

	public static void main(String args[]){
		Scanner sc;
		int n, x, y;

		sc = new Scanner(System.in);
		n = sc.nextInt();
		x = 0;
		y = 0;

		for (int i = 1; i <= n; i++){
			x = sc.nextInt();
			y = sc.nextInt();

			int contador = 0;
			int soma = 0;

			while (contador < y){
				if (Impar(x)){
					soma += x;
					contador++;
				}

				x++;
			}

			System.out.println(soma);
		}
		sc.close();
	}
}