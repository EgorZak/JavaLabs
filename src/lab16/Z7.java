package lab16;

public class Z7 {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[] {1, 2, 99, 98, 97, 96, 95, 94, 93, 1};
        printArray(reverse(testArray));
    }

    public static Integer[] reverse(Integer[] testArray)
    {
        Integer[] reverseArray = new Integer[testArray.length];

        int j = 0;
        for (int i = testArray.length - 1; i >= 0; i--) {
            reverseArray[j] = testArray[i];
            j++;
        }

        return reverseArray;
    }

    public static void printArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
