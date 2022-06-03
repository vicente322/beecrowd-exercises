/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
v.hofmeister@edu.pucrs.br
24/04/2022
*/
import java.util.Scanner;

public class Intervalo2{
	public static void main(String args[]){
		Scanner teclado;
		int n, x, in, out;

		teclado = new Scanner(System.in);
		n = teclado.nextInt();
		in = 0;
		out = 0;

		for (int cont = 0; cont < n; cont++){
			x = teclado.nextInt();

			if (x >= 10 && x <= 20){
				in++;
			} else {
				out++;
			}
		}

		System.out.printf("%d in\n%d out\n", in, out);
	}
}