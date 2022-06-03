import java.util.Scanner;

public class Main{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int n;
            String m, m1, m2, m3;
            m1 = "";
            m2 = "";
            m3 = "";

            n = sc.nextInt();

            for (int i = 1; i <= n; i++){
                  m = sc.nextLine();

                  for (int c = 0; c < m.length(); c++){

                        if (m.charAt(0) >= 'A' && m.charAt(0) <= 'Z' || m.charAt(0) >= 'a' && m.charAt(0) <= 'z'){
                              m1 = m1 + (m.charAt(0) + 3);
                        }
                        else {
                              m1 = m1 + (m.charAt(0));
                        }
                  }

                  System.out.println(m1);
            }
      }
}
