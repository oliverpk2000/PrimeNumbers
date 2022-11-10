package primeNumbers;

import java.util.ArrayList;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class ListPrimeSieve {
  public static int amountOfPrimes(int last) {
    ArrayList<Integer> knownPrimes = new ArrayList<>();
    knownPrimes.add(2);

    for (int i = 3; i <= last; i++) {
      boolean primeNum = true;
      for (Integer knownPrime : knownPrimes) {
        if (i % knownPrime == 0) {
          primeNum = false;
          break;
        }
      }
      if (primeNum) {
        knownPrimes.add(i);
      }
    }
    return knownPrimes.size();
  }
}
