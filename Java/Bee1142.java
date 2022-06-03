/*Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão
apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

v.hofmeister@edu.pucrs.br
30/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Pum{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n, linhas;

		teclado = new Scanner(System.in);
		linhas = teclado.nextInt();
		n = 1;
		teclado.close();

		for (int i = 1; i <= linhas; i++){
			System.out.print(n + " ");
			n++;
			System.out.print(n + " ");
			n++;
			System.out.print(n + " ");
			n++;
			System.out.println("PUM");
			n++;
		}
	}
}