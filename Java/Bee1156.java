/*Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

v.hofmeister@edu.pucrs.br
04/05/2022
*/
public class SequenciaS2{
	public static void main(String args[]){
		double s, n, m;

		s = 1.0;
		n = 3.0;
		m = 2.0;

		while(n <= 39){
			s += n/m;

			n += 2.0;
			m *= 2.0;
		}

		System.out.printf("%.2f\n", s);
	}
}