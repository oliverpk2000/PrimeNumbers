package primeNumbers;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class inefficientPrimeSieve {
  public static int amountOfPrimes(int last) {
    int countPrimes = 0;

    for (int i = 1; i <= last; i++) {
      int modCount = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0){
          modCount++;
        }
      }

      if(modCount == 3){
        countPrimes++;
      }
    }

    return countPrimes;
  }
}
