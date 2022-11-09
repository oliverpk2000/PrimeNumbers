package primeNumbers;

import java.time.Duration;
import java.time.Instant;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class testMain {
  public static void main(String[] args) {
    int n = 100000;
    Instant start = Instant.now();
    int primeAmount = inefficientPrimeSieve.amountOfPrimes(n);
    Instant end = Instant.now();
    Duration diff = Duration.between(start, end);
    System.out.printf("amount of primes = %d, time taken in millisec for n = %d: %d%n", primeAmount, n, diff.toMillis());
  }
}
