package lab16;

public class Z3 {
    public static void main(String[] args) {
        int[] testArray = new int[25];

        printArray(fillArray(testArray));
    }

    public static int[] fillArray(int[] array)
    {
        int min = 10;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            int rand = min + (int) (Math.random() * (max - min + 1));
            if (rand / 10 == rand % 10) array[i] = rand;
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
