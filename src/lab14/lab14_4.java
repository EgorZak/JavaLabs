package lab14;

public class lab14_4 {
    public static void main(String[] args) {
        System.out.println(sumDigits(5413));
    }

    public static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
}
