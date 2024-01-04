package Digital;

import java.util.Scanner;

public class Practise_Name_Age_Salary {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=user_input.next();
        System.out.println("Enter your age ");
        int age=user_input.nextInt();
        System.out.println("Enter your Salary ");
        double salary=user_input.nextDouble();
        System.out.println("Yours details are"  + name +"-" +age+ "-" + salary);
        System.out.println("Your age is age " +age);
        System.out.println("your salary is salary "+salary);
        user_input.close();

    }

}
