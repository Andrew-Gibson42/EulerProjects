import java.util.Scanner;

public class Euler7 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter an integer n to find the nth prime number: ");
    int max = scanDude.nextInt();

    int num = 1;
    int primes = 0;
    while(primes < max) {
      num ++;
      if(isPrime(num))
        primes++;
    }

    System.out.println(num);
  }

  public static boolean isPrime(int n) {
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
}
