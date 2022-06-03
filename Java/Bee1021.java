/* NotasMoedas 
O programa deve receber um numero com até duas casas decimais e
dar retorno de quantas notas e moedas devem ser recebidos para 
completar o valor de forma que seja utilizado o menor numero de
notas e moedas possivel.
v.hofmeister@edu.pucrs.br
28/03/2022
*/

import java.util.Scanner;

public class NotasMoedas{ //Para o Bee, mudar nome da classe para Main
	public static void main(String args[]){
		Scanner leitor;
		double valor;
		double cents;
		int valorInt;
		int valorCents;
		int valorIntRest;
		int valorCentsRest;
		int n100;
		int n50;
		int n20;
		int n10;
		int n5;
		int n2;
		int m1r;
		int m50;
		int m25;
		int m10;
		int m5;
		int m1c;

		System.out.println("NOTAS E MOEDAS"); //Para o Bee, retirar
		System.out.println("Quantas notas e moedas você deve receber?"); //Para o Bee, retirar
		System.out.println("Insira o valor"); //Para o Bee, retirar

		leitor = new Scanner(System.in);
		valor = leitor.nextDouble();
		valorInt = (int) valor;
		cents = (valor - valorInt) * 100; //Deixa somente os centavos e transforma a unidade de real para centavos de real
		valorCents = (int) cents;

		leitor.close();

		n100 = valorInt/100;
		valorIntRest = valorInt - (n100 * 100);
		n50 = valorIntRest/50;
		valorIntRest = valorIntRest - (n50 * 50);
		n20 = valorIntRest/20;
		valorIntRest = valorIntRest - (n20 * 20);
		n10 = valorIntRest/10;
		valorIntRest = valorIntRest - (n10 * 10);
		n5 = valorIntRest/5;
		valorIntRest = valorIntRest - (n5 * 5);
		n2 = valorIntRest/2;
		valorIntRest = valorIntRest - (n2 * 2);
		m1r = valorIntRest;

		m50 = valorCents/50;
		valorCentsRest = valorCents - (m50 * 50);
		m25 = valorCentsRest / 25;
		valorCentsRest = valorCentsRest - (m25* 25);
		m10 = valorCentsRest / 10;
		valorCentsRest = valorCentsRest - (m10 * 10);
		m5 = valorCentsRest / 5;
		valorCentsRest = valorCentsRest - (m5 * 5);
		m1c = valorCentsRest;

		System.out.println("NOTAS:");
		System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n50 + " nota(s) de R$ 50.00");
		System.out.println(n20 + " nota(s) de R$ 20.00");
		System.out.println(n10 + " nota(s) de R$ 10.00");
		System.out.println(n5 + " nota(s) de R$ 5.00");
		System.out.println(n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(m1r + " moeda(s) de R$ 1.00");
		System.out.println(m50 + " moeda(s) de R$ 0.50");
		System.out.println(m25 + " moeda(s) de R$ 0.25");
		System.out.println(m10 + " moeda(s) de R$ 0.10");
		System.out.println(m5 + " moeda(s) de R$ 0.05");
		System.out.println(m1c + " moeda(s) de R$ 0.01");
	}
}