import java.util.Scanner;

public class Euler14 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter a natural number to find the number with the longest Collatz sequence below that number: ");
    double top = scanDude.nextDouble();


    double longestCollatzNumber = 0;
    double longestCollatzLength = 0;
    double currentCollatzLength;
    for(double i = 1; i < top; i++) {
      if(i > (top / 2) && (i % 2) != 0) {//if i is above half or i is odd, check collatz length
        currentCollatzLength = getCollatzLength(i);
        if(currentCollatzLength > longestCollatzLength) {
          longestCollatzLength = currentCollatzLength;
          longestCollatzNumber = i;
        }
      }
    }

    System.out.println(longestCollatzNumber);
  }

  public static double getCollatzLength(double num) {
    double length = 1;
    while(num != 1) {
      if((num % 2) == 0)
        num = num / 2;
      else
        num = 3 * num + 1;
      length++;
    }

    return length;
  }
}
