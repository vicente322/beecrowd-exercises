/*O programa deve ler uma valor inteiro positivo X, e mostrar os números impares entre 1 e X.
v.hofmeister@edu.pucrs.br
20/04/2022
*/
import java.util.Scanner;

public class Impares{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int n = 1;

		while (n <= x){
			if(n % 2 != 0){
				System.out.println(n);
			}
			n++;
		}

	}
}