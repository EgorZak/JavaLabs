package lab9;


public class Lab9_4 {
    public static void main(String[] args) {
        int x;
        for (int i = 1; i <= 19; i++) {

            x = -9 + (int) (Math.random() * 18 + 1);
            if (x!=0) {
            System.out.print(" "+x+" ");}

            if (x == 0) System.out.print("%"+x+"%");
        }
    }

}






