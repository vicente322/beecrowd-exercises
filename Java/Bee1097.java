/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
public class Sequencial3{
	public static void main(String args[]){
		int i, j, cont;

		i = 1;
		j = 7;
		cont = 1;

		while (i < 10){
			System.out.printf("I=%d J=%d\n", i, j);

			if (cont < 3){
				j -= 1;
				cont++;
			} else {
				cont = 1;
				j += 4;
				i += 2;
			}
		}
	}
}