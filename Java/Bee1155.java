/*Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

v.hofmeister@edu.pucrs.br
03/05/2022
*/
public class SequenciaS{
	public static void main(String args[]){
		double s;

		s = 0;

		for (double i = 1.0; i <= 100.0; i++){
			s += 1.0 / i;
		}

		System.out.printf("%.2f\n", s);
	}
}