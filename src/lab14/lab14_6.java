package lab14;

public class lab14_6 {
        public static void main(String[] args) {
            div(125);
        }

        public static void div(int number) {
            String result = "";

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) result += i + " ";
            }

            if (result.length() != 4) {
                System.out.println(result);
            } else {
                System.out.println("Делителей нет");
            }
        }
    }


