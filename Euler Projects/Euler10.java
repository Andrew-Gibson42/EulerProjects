import java.util.Scanner;

public class Euler10 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter an integer to find the sum of all prime numbers less than that integer: ");
    double testNumber = scanDude.nextInt();

    double sum = 0;

    for(int i = 2; i<= testNumber; i++)
    {
      if(isPrime(i)) {
        sum += i;
      }
    }

    System.out.println(sum);
  }

  public static boolean isPrime(int n) {
    for(int j = 2; j < n; j++) {
      if(n % j == 0) {
        return false;
      }
    }
    return true;
  }
}
