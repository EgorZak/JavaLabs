package lab16;

public class Z10 {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[] {1, 5, 99, 98, 97, 96, 95, 94, 93, 5};
        printArray(evenElements(testArray));
    }

    public static Integer[] evenElements(Integer[] array)
    {
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) evenCount++;
        }

        Integer[] evenArray = new Integer[evenCount];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }
        }

        return evenArray;
    }

    public static void printArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
