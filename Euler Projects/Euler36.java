import java.util.Scanner;
import java.lang.Integer;
import java.math.BigInteger;

public class Euler36 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    //System.out.println("Enter a number to find all integers palindromic in base 10 and base 2 less than that number: ");
    int limit = 1000000;

    int sum = 0;

    String place;

    for(int i = 1; i < limit; i++) {
      place = Integer.toString(i);
      BigInteger big = new BigInteger(place);

      if(isPalindromic(big)) {
        if(isPalindromic(getBinary(big))) {
          sum += i;
        }
      }
    }

    System.out.println(sum);
  }

  public static boolean isPalindromic(BigInteger n) { //works
    String s = String.valueOf(n);
    int length = s.length();

    if(length == 1)
      return true;

    int index1 = 0,
        index2 = length - 1;
    boolean palindromic = true;
    while(true) {
      if(s.charAt(index1) == s.charAt(index2)) {
        index1++;
        index2--;
      }
      else {
        palindromic = false;
        break;
      }

      if(index1 == index2 || (index2 - index1) == -1) { //breaks if there's only 1 number left (as in, nothing to compare to)
        break;
      }
    }

    return palindromic;
  }

  public static BigInteger getBinary(BigInteger n) {
    String s = n.toString(2);
    BigInteger placeholder = new BigInteger(s);
    return placeholder;
  }
}
