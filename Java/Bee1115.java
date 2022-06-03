/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas
coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

v.hofmeister@edu.pucrs.br
27/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Quadrante{
	public static void main(String args[]){
		Scanner teclado;
		int x, y;

		teclado = new Scanner(System.in);

		while (true){
			x = teclado.nextInt();
			y = teclado.nextInt();

			if (x == 0 || y ==0){
				break;	
			}

			if (x > 0){
				if (y > 0){
					System.out.println("primeiro");
				} else if ( y < 0) {
					System.out.println("quarto");
				}
			} else if (x < 0) {
				if (y > 0){
					System.out.println("segundo");
				} else if (y < 0){
					System.out.println("terceiro");
				}
			}
		}
	}
}