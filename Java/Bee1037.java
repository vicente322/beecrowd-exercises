/*Intervalo
O programa deve receber um número qualquer com ponto flutuante, e determinar
se este número se encontra em um dos intervalos listados ou fora de intervalo.
Os intervalos são os seguintes:
[0,25], (25,50], (50,75], (75,100]
v.hofmeister@edu.pucrs.br
28/03/2022
*/

import java.util.Scanner;

public class Intervalo{//Alterar classe para Main para o Bee
	public static void main(String args[]){
		Scanner leitor;
		double numero;

		System.out.println("INTERVALO");//Retirar para o Bee
		System.out.println("Insira um valor para determinar em qual intervalo ele se encontra.");//Retirar para o Bee

		leitor = new Scanner (System.in);
		numero = leitor.nextDouble();

		if (numero < 0){
			System.out.println("Fora de intervalo");
		}
		else{
			if (numero <= 25){
				System.out.println("Intervalo [0,25]");
			}
			else{
				if (numero <= 50){
					System.out.println("Intervalo (25,50]");
				}
				else{
					if (numero <= 75){
						System.out.println("Intervalo (50,75]");
					}
					else{
						if (numero <= 100){
							System.out.println("Intervalo (75,100]");
						}
						else{
							System.out.println("Fora de intervalo");
						}
					}
				}
			}
		}
	}
}