/*Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel”
caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro.
Utilize cast :)

v.hofmeister@edu.pucrs.br
28/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class DivisaoXY{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n;
		double x, y, resultado;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++){
			x = teclado.nextDouble();
			y = teclado.nextDouble();

			if ( y == 0){
				System.out.println("divisao impossivel");
			} else {
				resultado = x / y;

				System.out.printf("%.1f\n", resultado);
			}
		}

		teclado.close();
	}
}