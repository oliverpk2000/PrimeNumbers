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
      int modCount = 0;
      for (int j = 0; j < i; j++) {
        if(i % knownPrimes.get(j) == 0){
          modCount++;
        }
      }
      if(modCount == 2){
        knownPrimes.add(i);
      }
    }
    return knownPrimes.size();
  }
}
