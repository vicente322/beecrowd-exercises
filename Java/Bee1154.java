/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de
um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor
negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

v.hofmeister@edu.pucrs.br
03/05/2022
*/
import java.util.Scanner;

public class Idades{
	public static double media(double soma, double divisor){
		double resultado = soma / divisor;

		return resultado;
	}

	public static void main(String args[]){
		Scanner sc;
		double idade, somaIdades, individuos, mediaIdades;

		sc = new Scanner(System.in);
		idade = sc.nextDouble();
		somaIdades = 0.0;
		individuos = 0.0;

		while(idade >= 0.0){
			somaIdades += idade;
			individuos++;
			idade = sc.nextDouble();
		}
		sc.close();

		mediaIdades = media(somaIdades, individuos);

		System.out.printf("%.2f\n",mediaIdades);
	}
}