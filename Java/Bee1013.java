import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        
        int maiorAB = (A+B+Math.abs(A-B))/2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        
        System.out.printf(maiorABC + " eh o maior");
    }
}