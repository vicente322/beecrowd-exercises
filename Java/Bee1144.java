/*Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas
na execução do programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos,
todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.

v.hofmeister@edu.pucrs.br
30/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class SequenciaLogica{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int linhas, n, quadrado, cubo;

		teclado = new Scanner(System.in);
		linhas = teclado.nextInt();
		teclado.close();
		n = 1;

		for (int i = 1; i <= linhas * 2; i++){
			quadrado = (int)Math.pow(n, 2);
			cubo = (int)Math.pow(n, 3);

			if (i % 2 == 0){
				quadrado++;
				cubo++;
			}

			System.out.printf("%d %d %d\n", n, quadrado, cubo);

			if (i % 2 == 0){
				n++;
			}
		}
	}
}