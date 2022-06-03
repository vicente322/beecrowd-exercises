/*Tempo de Jogo com Minutos
O programa deve receber 4 valores inteiros.
Estes valores se referem, respectivamente, a hora de inicio, minuto de inicio, hora final e minuto final de uma partida.
O programa ira calcular quantas horas e minutos durou a partida, sendo mínimo de 1 minuto e máximo de 24 horas.
v.hofmeister@edu.pucrs.br
13/04/2022
*/

import java.util.Scanner;

public class JogoMinutos{ //Trocar nome da classe para o Bee
	public static void main(String args[]){
		Scanner teclado;
		int horaI; //Hora inicial
		int minutoI; //Minuto inicial
		int horaF; //Hora Final
		int minutoF; //Minuto Final
		int duracaoH; //Horas de duração
		int duracaoM; //Minutos de duração

		System.out.println("Tempo de Jogo com Minutos");
		System.out.println("Insira a hora e o minuto inicial e a hora e o minuto final do jogo.");

		teclado = new Scanner(System.in);
		horaI = teclado.nextInt();
		minutoI = teclado.nextInt();
		horaF = teclado.nextInt();
		minutoF = teclado.nextInt();
		duracaoH = horaF - horaI;
		duracaoM = minutoF - minutoI;

		if (duracaoH == 0 && duracaoM == 0){
			duracaoH = 24;
		}
		else{
			if(duracaoH == 0 && minutoF < minutoI){
				duracaoH = 23;
			}

			if (duracaoH < 0){
				duracaoH = 24 + duracaoH;
			}

			if (duracaoM < 0){
				duracaoM = 60 + duracaoM;
			}

			if (minutoF < minutoI && duracaoH != 23){
				duracaoH = duracaoH - 1;
			}
		}

		System.out.println("O JOGO DUROU " + duracaoH + " HORA(S) E " + duracaoM + " MINUTO(S)");
	}
}