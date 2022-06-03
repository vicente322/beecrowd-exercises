/*O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o
valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir
de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser
40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo abaixo.

v.hofmeister@edu.pucrs.br
04/05/2022
*/
import java.util.Scanner;

public class ParesConsecutivos{
	public static boolean Par(int numero){
		boolean resultado = numero % 2 == 0;

		return resultado;
	}

	public static void main(String args[]){
		Scanner sc;
		int x, soma, contador;

		sc = new Scanner(System.in);
		x = sc.nextInt();

		while (x != 0){
			soma = 0;
			contador = 0;

			while (contador < 5){
				if (Par(x)){
					soma += x;
					contador++;
				}

				x++;
			}
			System.out.println(soma);

			x = sc.nextInt();
		}

		sc.close();
	}
}