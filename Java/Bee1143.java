/*Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade
de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

v.hofmeister@edu.pucrs.br
30/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class QuadradoCubo{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int linhas, quadrado, cubo;

		teclado = new Scanner(System.in);
		linhas = teclado.nextInt();
		teclado.close();

		for (int i = 1; i <= linhas; i++){
			quadrado = (int)Math.pow(i, 2);
			cubo = (int)Math.pow(i, 3);

			System.out.printf("%d %d %d\n", i, quadrado, cubo);
		}
	}
}