package lab16;

public class Z9 {
    public static void main(String[] args) {
        Integer[] testArray1 = new Integer[] {1, 5, 99, 98, 97, 96, 95, 94, 93, 5};
        Integer[] testArray2 = new Integer[] {1, 2, 99, 98, 97, 96, 95, 94, 93, 5};
//        consistsIn(testArray1, testArray2);
        System.out.println(consistsIn(testArray1, testArray2));
    }

    public static boolean consistsIn(Integer[] array1, Integer[] array2)
    {
        boolean result = true;

        for (int i = 0; i < array1.length; i++) {
            if (!elemExists(array2, array1[i])) result = false;
        }

        return result;
    }

    public static boolean elemExists(Integer[] array, Integer elem)
    {
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (elem == array[i]) result = true;
        }

        return result;
    }
}
