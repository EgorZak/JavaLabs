package Lectures;

public class Lek11 {


    public static void main(String[] args) {
        String[] array = new String[] {"one", "two", "three", "four"};
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min) min = array[i].length();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == min) System.out.println(array[i]);
        }
    }

}





