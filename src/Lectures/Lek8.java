package Lectures;


public class Lek8 {


    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 15; i++) {
            a = (int)  (Math.random() * 89 + 1);
            System.out.println(a);
            if (a / 3 == 0) System.out.println("Число кратное 3: " + a);
            if (a / 5 == 0) System.out.println("Число кратное 5: " + a);
        }

    }
}


