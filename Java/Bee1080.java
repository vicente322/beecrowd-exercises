/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class MaiorPosicao{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int valor, maiorValor, posicao;

		teclado = new Scanner(System.in);
		maiorValor = 0;
		posicao = 0;

		for (int contador = 1; contador <= 100; contador++){
			valor = teclado.nextInt();

			if (contador == 1){
				maiorValor = valor;
				posicao = 1;
			} else if (valor > maiorValor){
				maiorValor = valor;
				posicao = contador;
			}
		}

		System.out.printf("%d\n%d\n", maiorValor, posicao);
	}
}