/*Tempo de Jogo
O programa deve receber dois valores inteiros, referentes a hora inicial e final de um jogo.
O jogo pode começar em um dia e terminar em outro, e deve ter duração mínima de uma hora e maxima de 24.
A saída deve ser o tempo de duração do jogo.
v.hofmeister@edu.pucrs.br
13/04/2022
*/

import java.util.Scanner;

public class Tempo{ //Mudar nome da classe para o Bee
	public static void main(String args[]){
		Scanner teclado;
		int horaI; //Hora de inicial
		int horaF; //Hora final
		int duracao; //Duração da partida

		System.out.println("Tempo de Jogo"); //Retirar para o Bee
		System.out.println("Insira o horario inicial e final da partida:"); //Retirar para o Bee

		teclado = new Scanner(System.in);
		horaI = teclado.nextInt();
		horaF = teclado.nextInt();
		duracao = horaF - horaI;

		if (duracao <= 0){
			duracao = 24 + duracao;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}
}