/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

v.hofmeister@edu.pucrs.br
26/04/2022
*/
public class Sequencial2{
	public static void main(String args[]){
		int i, j;

		i = 1;
		j = 7;

		while (i < 10){
			System.out.printf("I=%d J=%d\n", i, j);
			
			if (j > 5){
				j--;
			} else {
				j = 7;
				i+= 2;
			}
		}
	}
}