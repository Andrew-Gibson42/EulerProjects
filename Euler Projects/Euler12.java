import java.util.Scanner;
import java.lang.Math;

public class Euler12 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter an integer to find the first triangle number to have over that many divisors: ");
    int num = scanDude.nextInt();

    int divisors = 0;
    int triangleNumber = 0;

    int i = 1;
    while (true) {
      triangleNumber += i;
      divisors = getDivisors(triangleNumber);
      if(divisors > num) {
        break;
      }
      i++;
    }

    System.out.println(triangleNumber);
  }

  public static int getDivisors(int tri) {
    int div = 0;

    for(int j = 1; j <= tri; j++) {
      if((tri % j) == 0)
        div++;
    }

    return div;
  }
}
