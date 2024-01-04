package Digital;

public class Continuestmt {
    public static void main(String[] args) {
       // int num =5;
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5) continue;
            System.out.println("**After");
        }
    }
}
