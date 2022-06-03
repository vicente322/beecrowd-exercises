import java.util.Scanner;

public class TempoEvento{
	public static void main(String args[]){
	 	Scanner teclado;
	 	String[] dia0Str; //Dia inicial "bruto"
	 	String[] hora0Str; //Hora inicial "bruto"
	 	String[] diaFinalStr; //Dia final "bruto"
	 	String[] horaFinalStr; //Hora final "bruto"
	 	int dia0;
	 	int hora0;
	 	int minuto0;
	 	int segundo0;
	 	int diaFinal;
	 	int horaFinal;
	 	int minutoFinal;
	 	int segundoFinal;
	 	int diaTotal;
	 	int horaTotal;
	 	int minutoTotal;
	 	int segundoTotal;

	 	System.out.println("Tempo de um Evento!");
	 	System.out.println("Insira o dia de Abril que iniciou o evento:");

	 	teclado = new Scanner(System.in);
	 	dia0Str = teclado.nextLine().split(" ");

	 	System.out.println();
	 	System.out.println("Insira o horário, com minutos e segundos, que iniciou o evento:");
	 	
	 	hora0Str = teclado.nextLine().replaceAll(" ", "").split(":");
	 	
	 	System.out.println();
	 	System.out.println("Insira o dia que encerrou o evento:");

	 	diaFinalStr = teclado.nextLine().split(" ");
	 	
	 	System.out.println();
	 	System.out.println("Insira o horário, com minutos e segundos, que encerrou o evento:");

	 	horaFinalStr = teclado.nextLine().replaceAll(" ", "").split(":");
	 	teclado.close();

	 	dia0 = Integer.parseInt(dia0Str[1]);
	 	hora0 = Integer.parseInt(hora0Str[0]);
	 	minuto0 = Integer.parseInt(hora0Str[1]);
	 	segundo0 = Integer.parseInt(hora0Str[2]);
	 	diaFinal = Integer.parseInt(diaFinalStr[1]);
	 	horaFinal = Integer.parseInt(horaFinalStr[0]);
	 	minutoFinal = Integer.parseInt(horaFinalStr[1]);
	 	segundoFinal = Integer.parseInt(horaFinalStr[2]);
	 	diaTotal = diaFinal - dia0;
	 	horaTotal = horaFinal - hora0;
	 	minutoTotal = minutoFinal - minuto0;
	 	segundoTotal = segundoFinal - segundo0;

	 	if (segundo0 == segundoFinal){
	 		segundoTotal = 0;
	 	}
	 	else if (segundo0 < segundoFinal){
	 		segundoTotal = segundoFinal - segundo0;
	 	}
	 	else if (segundo0 > segundoFinal){
	 		segundoTotal = (60 - segundo0) + segundoFinal;
	 	}

	 	if (minuto0 == minutoFinal){
	 		minutoTotal = 0;
	 	}
	 	else if (minuto0 < minutoFinal){
	 		minutoTotal = minutoFinal - minuto0;
	 	}
	 	else if (minuto0 > minutoFinal){
	 		minutoTotal = (60 - minuto0) + minutoFinal;
	 	}

	 	if (hora0 == horaFinal){
	 		horaTotal = 0;
	 	}
	 	else if (hora0 < horaFinal){
	 		horaTotal = horaFinal - hora0;
	 	}
	 	else if (hora0 > horaFinal){
	 		horaTotal = (24 - hora0) + horaFinal;
	 	}

	 	if (segundo0 > segundoFinal){
	 		if (minutoTotal == 0){
	 			minutoTotal = 60;
	 		}
	 		minutoTotal--;
	 	}

	 	if (minuto0 > minutoFinal){
	 		if (horaTotal == 0){
	 			horaTotal = 24;
	 			diaTotal--;
	 		}
	 		horaTotal--;
	 	}

	 	if (hora0 > horaFinal){
	 		diaTotal--;
	 	}

	 	System.out.println();
	 	System.out.println(diaTotal + " dia(s)");
		System.out.println(horaTotal + " hora(s)");
		System.out.println(minutoTotal + " minuto(s)");
		System.out.println(segundoTotal + " segundo(s)");

	}
}