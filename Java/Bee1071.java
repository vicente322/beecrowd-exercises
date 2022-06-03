/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
v.hofmeister@edu.pucrs.br
24/04/2022
*/
import java.io.IOException;
import java.util.Scanner;

public class ImparesConsecutivos{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int x, y, soma;

		teclado = new Scanner(System.in);
		x = teclado.nextInt();
		y = teclado.nextInt();
		soma = 0;

		if (x < y){
			for (int i = x + 1; i < y; i++){
				if (i % 2 != 0){
					soma += i;
				}
			}
		} else {
			for (int i = y + 1; i < x; i++){
				if (i % 2 != 0){
					soma += i;
				}
			}
		}

		System.out.println(soma);
	}
}