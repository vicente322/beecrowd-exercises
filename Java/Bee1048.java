/*Aumento de Salario
O programa deve recever um valor referente ao salário de um funcionário, e 
então calcular o novo salário com base em uma tabela pré estabelecida.
A saida deve ser o novo salário, o reajuste ganho e o reajuste em percentual.
v.hofmeister@edu.pucrs.br
14/04/2022
*/

import java.util.Scanner;

public class Aumento{
	public static void main(String args[]){
		Scanner teclado;
		double salario;
		double percentual;
		double ajuste;
		double reajuste;
		double salarioF;

		System.out.println("Aumento de Salario");
		System.out.println("Insira o salário atual:");

		teclado = new Scanner(System.in);
		salario = teclado.nextDouble();
		teclado.close();

		if (salario <= 400.00){
			percentual = 15;
		}
		else{
			if (salario <= 800.00){
				percentual = 12;
			}
			else{
				if (salario <= 1200.00){
					percentual = 10;
				}
				else{
					if (salario <= 2000.00){
						percentual = 7;
					}
					else{
						percentual = 4;
					}
				}
			}
		}


		ajuste = percentual / 100;
		reajuste = salario * ajuste;
		salarioF = salario + reajuste;

		System.out.printf("Novo salario: %.2f \n", salarioF);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %.0f", percentual);
		System.out.println(" %");
	}
}