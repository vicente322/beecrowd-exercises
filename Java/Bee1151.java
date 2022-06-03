/*A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva
um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver
espaço após o último valor.

v.hofmeister@edu.pucrs.br
03/05/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Fibonacci{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int numeroN, nAtual, x, y, contador;

		teclado = new Scanner(System.in);
		numeroN = teclado.nextInt();
		teclado.close();
		contador = 1;
		nAtual = 0;
		x = 0;
		y = 0;

		while (contador <= numeroN){
			if (contador == 1){
				nAtual = 0;
			} else if (contador == 2){
				nAtual = 1;
			} else {
				x = y;
				y = nAtual;
				nAtual = x + y;
			}

			if (contador < numeroN){
				System.out.printf("%d ", nAtual);
			} else {
				System.out.println(nAtual);
			}

			contador++;
		}
	}
}