import java.util.Scanner;
/**
*
*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
*
*Entrada
*A entrada contém 20 valores inteiros, positivos ou negativos.
*
*Saída
*Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-05
*/

public class Main{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int[] n = new int[20];
            int[] m = new int[20];

            for (int i1 = 0; i1 < 20; i1++){
                  n[i1] = sc.nextInt();
            }

            for (int i2 = 19; i2 >= 0; i2--){
                  m[i2] = n[19 - i2];
            }

            for (int i3 = 0; i3 <= 19; i3++){
                  System.out.printf("N[%d] = %d\n", i3, m[i3]);
            }
      }
}
