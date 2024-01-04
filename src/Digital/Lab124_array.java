package Digital;

import java.util.Scanner;

public class Lab124_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int [] int_arry=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int_arry[i]=sc.nextInt();

        }
        System.out.println("----output");

    }
}
