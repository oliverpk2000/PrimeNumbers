package primeNumbers;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class TestHelpClass {
    public static int userInputTaker() {

        Scanner inputScanner = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.print("n:");
            String input = inputScanner.nextLine();
            try {
                userInput = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("illegal argument");
            }
        }
        inputScanner.close();
        return userInput;
    }

    public static void functionTimer(int userInput) {
        Instant start = Instant.now();
        int primeAmount = ListPrimeSieve.amountOfPrimes(userInput);
        Instant end = Instant.now();
        Duration diff = Duration.between(start, end);
        System.out.printf("list sieve, amount of primes = %d, time taken in seconds for n = %d: %d (%d milliseconds)%n", primeAmount, userInput, diff.toSeconds(), diff.toMillis());

        Instant start2 = Instant.now();
        int primeAmount2 = InefficientPrimeSieve.amountOfPrimes(userInput);
        Instant end2 = Instant.now();
        Duration diff2 = Duration.between(start2, end2);
        System.out.printf("inefficient sieve, amount of primes = %d, time taken in seconds for n = %d: %d (%d milliseconds)%n", primeAmount2, userInput, diff2.toSeconds(), diff2.toMillis());
    }
}
