/**
 * Calcula a formula de Bhaskara
 * 
 * @author v.hofmeister@edu.pucrs.br 
 * @version 28/03/2022
 */

import java.util.Scanner;

public class Bhaskara{
    public static void main(String args[]){
        Scanner leitor;
        double A;
        double B;
        double C;
        double raiz1;
        double raiz2;
        double delta;
        
        leitor = new Scanner(System.in);
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        leitor.close();
        delta = Math.pow(B,2) - (4 * A * C);
        raiz1 = (-B + Math.sqrt(Math.pow(B, 2) - (4 * A * C)))/ (2 * A);
        raiz2 = (-B - Math.sqrt(Math.pow(B, 2) - (4 * A * C)))/ (2 * A);
        
        if (A == 0.0){
            System.out.println("Impossivel calcular");
        }
        else{
            if (delta < 0.0){
                System.out.println("Impossivel calcular");
            }
            else{
                System.out.printf("R1 = %.5f\n", raiz1);
                System.out.printf("R2 = %.5f\n", raiz2);
            }   
        }
    }
}