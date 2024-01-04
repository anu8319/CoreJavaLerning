package Digital;

public class Lab125_array {
    public static void main(String[] args) {
        int[][] array_2d=new int[3][3];
        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;
        array_2d[1][0]=4;
        array_2d[1][1]=5;


        for(int i=0;i< array_2d.length;i++){
            System.out.println(array_2d[i][i]);
        }
    }
}
