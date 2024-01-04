package Digital;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //problem
        //factorial Program
        //1!=1
        //2!=2*1;
        //3!=3*2*1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        long fact=1;
        int i=1;
        while(i<=number){
            fact =fact*i;
            i++;
        }
        System.out.println("Fact ----" +
                "" + fact);
        sc.close();
        }

    }


