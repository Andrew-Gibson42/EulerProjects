import java.util.Scanner;

public class Euler21 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter an integer to find the sum of all amicable numbers less than that integer: ");
    int limit = scanDude.nextInt();

    int amicableSum = 0;
    int sumPlaceholder = 0;
    for(int j = 1; j < limit; j++) {
      sumPlaceholder = getSumOfDivisors(j);
      if(j == getSumOfDivisors(sumPlaceholder)) {
        if(j != sumPlaceholder) {
          amicableSum += j; //only does one half of amicable pair, as the other should be adressed eventually in the loop
        }
      }
    }

    System.out.println(amicableSum);
  }

  public static int getSumOfDivisors(int n) {
    int sum = 0;

    for(int i = 1; i < n; i++) {
      if((n % i) == 0) {
        sum += i;
      }
    }

    return sum;
  }
}
