package lab16;

import java.util.Arrays;
import java.util.Collections;

public class Z5 {
    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 99, 98, 97, 96, 95, 94, 93, 1};
        System.out.println(isSortFromRange(testArray, 2, 8));;
    }

    public static boolean isSortFromRange(int[] array, int start, int end)
    {
        Integer[] arrFromRange = new Integer[end - start + 1];

        int j = 0;
        for (int i = start; i <= end; i++) {
            arrFromRange[j] = array[i];
            j++;
        }

        Integer[] arrFromRangeCopy = arrFromRange.clone();
        Arrays.sort(arrFromRange, Collections.reverseOrder());
        return Arrays.equals(arrFromRange, arrFromRangeCopy);
    }

    public static void printArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}
