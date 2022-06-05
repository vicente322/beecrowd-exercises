/*Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios
(excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é
escrever um programa que imprima se um determinado número é perfeito ou não.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número
de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não,
um número perfeito.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação
fornecida.

v.hofmeister@edu.pucrs.br
08/05/2022
*/
import java.util.Scanner;

public class NumeroPerfeito{

	public static boolean ConfereDivisor(int valor1, int valor2){

		return valor1 % valor2 == 0;
	}
	public static int SomaDivisores(int valor){
		int soma = 0;

		for (int i = 1; i < valor; i++){
			if (ConfereDivisor(valor, i)){
				soma += i;
			}
		}

		return soma;
	}
	public static boolean ConferePerfeito(int valor){

		int soma = SomaDivisores(valor);

		if (valor == soma){
			System.out.printf("%d eh perfeito\n", valor);
		} else {
			System.out.printf("%d nao eh perfeito\n", valor);
		}

		return true;
	}

	public static void main(String args[]){
		Scanner teclado;
		int testes, numero, soma;

		teclado = new Scanner (System.in);
		testes = teclado.nextInt();

		for (int i = 1; i <= testes; i++){

			numero = teclado.nextInt();

			ConferePerfeito(numero);
		}

		teclado.close();
	}
}