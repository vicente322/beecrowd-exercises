import java.util.Scanner;

/**Fibonacci em vetor
*
*Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os
*2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os
*valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.
*
*Entrada
*A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste contém um
*único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.
*
*Saída
*Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.
*
*@author v.hofmeister@edu.pucrs.br
*@version 2022-06-06
*/

public class Main{

      public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int n;

      for (int i = 1; i <= t; i++){
            n = sc.nextInt();
            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;

            for (int c = 2; c <= n; c++){
                  f[c] = f[c - 1] + f[c - 2];
            }

            System.out.printf("Fib(%d) = %d\n", n, f[n]);
      }

      }
}