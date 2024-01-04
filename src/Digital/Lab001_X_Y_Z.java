package Digital;

import java.util.Scanner;

public class Lab001_X_Y_Z {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter x");
               double x = sc.nextDouble();
              System.out.println("Enter Y");
              double Y = sc.nextDouble();
              System.out.println("Enter z");
              double Z = sc.nextDouble();
              double result = 0;
              result=Math.cbrt(Math.pow(x,2) + Math.pow(Y,2) -Math.abs(Z));
              System.out.println(result);
              sc.close();

       }

}
