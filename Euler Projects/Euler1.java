import java.util.Scanner;

public class Euler1 {
  public static void main (String[] args) {
    int sum = 0;

    Scanner scanDude = new Scanner(System.in);

    System.out.println("Enter an integer for the sum of the multiples of 3 and 5 less than that integer: ");
    int stop = scanDude.nextInt();

    for(int i = 1; i < stop; i++) {
      if((i % 3) == 0)
        sum += i;
      else if ((i % 5) == 0)
        sum += i;
    }

    System.out.println(sum);

  }
}
