import java.util.Scanner;

/**Substituição de vetor I
*
* Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
*
* Entrada
* A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
*
* Saída
* Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
*
*@author v.hofmeister@edu.pucrs.break;
*version 2022-06-01
*/

public class Main{

      public static void main(String args[]){
             Scanner sc;
             int[] x = new int[10];

             sc = new Scanner(System.in);

             for (int i = 0; i < 10; i ++){
                   x[i] = sc.nextInt();

                   if (x[i] <= 0){
                        x[i] = 1;
                  }

                  System.out.println("X[" + i + "] = " + x[i]);
             }
      }
}
