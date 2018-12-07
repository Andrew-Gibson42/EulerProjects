import java.util.Scanner;

public class Euler2 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter a natural number to find the sum of all even Fibonacci numbers less than that number: ");
    double top = scanDude.nextDouble();

    double num1 = 1;
    double num2 = 2;

    double evenSum = 0;

    while(num1 < top && num2 < top) {
      if(num2 > num1) {
        if((num2 % 2) == 0)
          evenSum += num2;
        num1 = num2 + num1;
      }
      else {
        if((num1 % 2) == 0)
          evenSum += num1;
        num2 = num1 + num2;
      }
    }

    System.out.println(evenSum);
  }
}
