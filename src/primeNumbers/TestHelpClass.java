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
  public static int userInputTaker(){

    Scanner inputScanner = new Scanner(System.in);
    int userInput;
    System.out.print("n:");
    String input = inputScanner.nextLine();

    try {
      userInput = Integer.parseInt(input);
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }

    inputScanner.close();
    return userInput;
  }

  public static void functionTimer(int userInput){
    Instant start = Instant.now();
    int primeAmount = InefficientPrimeSieve.amountOfPrimes(userInput);
    Instant end = Instant.now();
    Duration diff = Duration.between(start, end);
    System.out.printf("amount of primes = %d, time taken in millisecond for n = %d: %d%n", primeAmount, userInput, diff.toMillis());
  }
}
