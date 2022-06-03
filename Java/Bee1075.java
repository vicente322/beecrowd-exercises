/*Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Resto2{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int n;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();
		teclado.close();

		for (int i = 1; i <= 10000; i++){
			if (i % n == 2){
				System.out.println(i);
			}
		}
	}
}