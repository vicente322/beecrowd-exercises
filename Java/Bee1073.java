/*Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta
errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;

public class QuadradoPares{
	public static void main(String args[]){
		Scanner teclado;
		int n, quadrado;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++){
			if (i % 2 == 0){
				quadrado = i * i;

				System.out.println(i + "^2 = " + quadrado);
			}
		}
	}
}