package Digital;

public class Lab129_String {
    public static void main(String[] args) {
        String name = "anagha";
        String y = "";
        for (int i = name.length()-1;i>=0; i--) {
            y=y+name.charAt(i);

        }
        System.out.println(y);
    }
}
