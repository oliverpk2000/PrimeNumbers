package primeNumbers;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class InefficientPrimeSieve {
  public static int amountOfPrimes(int last) {
    int countPrimes = 0;

    for (int i = 1; i <= last; i++) {
      int modCount = 0;

      for (int j = 1; j <= i + 1; j++) {
        if (i % j == 0){
          modCount++;
        }
      }

      if(modCount == 2){
        countPrimes++;
      }
    }

    return countPrimes;
  }
}
