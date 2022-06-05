/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

v.hofmeister@edu.pucrs.br
26/04/2022
*/
public class Sequencial1{
	public static void main(String args[]){
		int i, j;

		i = 1;
		j = 60;

		while (j >= 0){
			System.out.printf("I=%d J=%d\n", i, j);
			i += 3;
			j -= 5;
		}
	}
}