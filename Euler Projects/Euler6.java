import java.util.Scanner;
import java.lang.Math;

public class Euler6 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter a natural number to find the difference between the sum of squares and square of the sum: ");
    int num = scanDude.nextInt();

    double sumOfSquares = 0;
    double sum = 0;

    for(int i = 1; i <= num; i++) {
      sumOfSquares += Math.pow(i, 2);
      sum += i;
    }

    double squaredSum = Math.pow(sum, 2);

    System.out.println(squaredSum);
    System.out.println(sumOfSquares);

    System.out.println(squaredSum - sumOfSquares);
  }
}
