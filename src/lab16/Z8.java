package lab16;

public class Z8 {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[] {1, 2, 99, 98, 97, 96, 95, 94, 93, 5};
        printArray(offsetLeft(testArray));
    }

    public static Integer[] offsetLeft(Integer[] array)
    {
        Integer[] offsetArray = new Integer[array.length];
        offsetArray[array.length - 1] = array[0];

        for (int i = 1; i < array.length; i++) {
            offsetArray[i - 1] = array[i];
        }

        return offsetArray;
    }

    public static void printArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
