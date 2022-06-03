/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y
uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura
deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente,
caso contrário imprima a mensagem “Decrescente”.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class CrescenteDecrescente{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int x, y;

		teclado = new Scanner(System.in);

		while(true){
			x = teclado.nextInt();
			y = teclado.nextInt();

			if ( x == y){
				break;
			} else if (x > y){
				System.out.println("Decrescente");
			} else if (x < y){
				System.out.println("Crescente");
			}
		}
	}
}