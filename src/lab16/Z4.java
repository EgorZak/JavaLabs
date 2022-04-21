package lab16;

public class Z4 {
    public static void main(String[] args) {
        int[] testArray = new int[10];
        testArray = fillArray(testArray);
        printArray(testArray);
        System.out.println(sum(testArray, 4));
    }

    public static int sum(int[] array, int k)
    {
        int sum = 0;

        for (int i = k; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] fillArray(int[] array)
    {
        int min = 0;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}
