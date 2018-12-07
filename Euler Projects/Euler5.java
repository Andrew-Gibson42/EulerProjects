import java.util.Scanner;

public class Euler5 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter a natural number to find the first positive number evenly divisible by all natural numbers between 1 and that integer: ");
    int topDivisor = scanDude.nextInt();

    int firstNumber = 2;
    while(true) { //loop increments by 2, because the number is necessarily divisible by 2
      if(isDivisible(topDivisor, firstNumber))
        break;
      firstNumber += 2;
    }

    System.out.println(firstNumber);
  }

  public static boolean isDivisible(int top, int num) {
    for(int i = 1; i <= top; i++) {
      if((num % i) != 0)
        return false;
    }
    return true;
  }
}
