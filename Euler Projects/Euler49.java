import java.util.Arrays;

public class Euler49 {
  public static void main (String[] args) {
    System.out.println("This program will return all arithmetic sequences of length 3, where all terms are prime, and each sequence begins with a 4 digit number. ");

    for(int i = 1001; i <= 9999; i++) { //increments by 2, because no even can be prime
      if(isPrime(i)) { //if the first number is prime
        for(int j = 1; j < 4500; j++) { //limit is 4500, because at the minimum first value of 1000, adding 4500 two times would result in the first 5-digit number
          if(isPrime(i + j) && isFourDigits(i + j)) { //checks if second term is prime and is four digits
            if(isAPermutationOf(i, (i + j))) {
              if(isPrime(i + (2 * j)) && isFourDigits(i + (2 * j))) { //checks if third term is prime and is four digits
                if(isAPermutationOf(i, (i + (2 * j)))) {
                  System.out.println(i + ", " + (i + j) + ", " + (i + (2 *j)));
                }
              }
            }
          }
        }
      }
    }
  }

  public static boolean isPrime(int n) { //works
    if(n == 1)
      return false;

    if(n == 2)
      return true;

    if((n % 2) == 0)
      return false;

    for(int j = 3; j < Math.sqrt(n) + 1; j += 2) {
      if(n % j == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isFourDigits(int n) { //works
    if(String.valueOf(n).length() == 4)
      return true;

    return false;
  }

  public static String sort(String s) { //works
    char digits[] = s.toCharArray();

    Arrays.sort(digits);
    return new String(digits);
  }

  public static boolean isAPermutationOf(int original, int n1) {
    String s1 = String.valueOf(original);
    String s2 = String.valueOf(n1);

    if(sort(s1).equals(sort(s2)))
      return true;

    return false;
  }
}
