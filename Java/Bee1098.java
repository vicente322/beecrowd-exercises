/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
public class Sequencial4{
	public static void main(String args[]){
		double i, j;
		int iInt;

		i = 0.0;
		j = 1.0;

		while (i <= 2.0){
			iInt = (int)(i * 10);

			if(iInt % 10 != 0){
				System.out.printf("I=%.1f J=%.1f\n", i, j);
			} else if (iInt % 10 == 0){
				System.out.printf("I=%.0f J=%.0f\n", i, j);
			}

			if (j < i + 3){
				j++;
			} else {
				i += 0.20;
				j = 1 + i;
				i = Math.round(i * 100.0) / 100.0;
			}
		}
	}
}