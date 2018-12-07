import java.util.Scanner;
import java.lang.Math;

public class Euler3
{
  public static void main (String[] args)
  {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter an integer for the greatest prime factor: ");
    long num = scanDude.nextLong();

    long greatestPrimeFactor = 0;

    for(long i = 2; i <= num; i++) {
      if((num % i) != 0)
        continue;
      greatestPrimeFactor = i;
      while(true) { //since any composite number can be divided into prime factors, this divides the prime factor out of the composite number to make things go faster
        num = num / i;
        if((num % i) != 0)
          break;
      }
    }

    System.out.println(greatestPrimeFactor);
  }
}
