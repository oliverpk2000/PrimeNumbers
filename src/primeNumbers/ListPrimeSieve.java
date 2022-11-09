package primeNumbers;

import java.util.ArrayList;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class ListPrimeSieve {
  public static int amountOfPrimes(int last){
    ArrayList<Integer> knownPrimes = new ArrayList<>();
    knownPrimes.add(1);
    knownPrimes.add(2);
    for (int i = 3; i <= last; i++) {
      knownPrimes.add(i);
    }
    System.out.println("log");
    System.out.println("kek");
    return 0;
  }
}
