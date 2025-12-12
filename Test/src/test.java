import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17);

        System.out.println("Prime number check results:");

        // Check if each number in the list is prime
        for (int number : numbers) {
            boolean isPrime = true;

            // Prime check logic directly in the main method
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Print whether the number is prime or not
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
