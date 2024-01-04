package Digital;

public class Function2 {
    public static void main(String[] args) {
        System.out.println("Run file");
        int d=main(10);
        System.out.println(d);
        main("ana");
    }
     static void main(String a){
         System.out.println("i am main function ");
     }
     static int main(int a){
        return a+ 101;
     }
}
