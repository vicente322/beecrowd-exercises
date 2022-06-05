/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

v.hofmeister@edu.pucrs.br
26/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class SenhaFixa{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		String senha;

		teclado = new Scanner(System.in);

		while(true){
			senha = teclado.nextLine();

			if (senha.equals("2002")){
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}
		}

		teclado.close();
	}
}