package primeNumbers;

/**
 * Created: 09/11/2022
 *
 * @author Oliver Pecek (oliver)
 */
public class PrimeSieveTestMain {
  public static void main(String[] args) {
    int n = TestHelpClass.userInputTaker();
    TestHelpClass.functionTimer(n);
    System.out.println("list is much faster");
  }
}
