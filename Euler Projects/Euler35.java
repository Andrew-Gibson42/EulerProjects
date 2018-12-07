import java.util.Scanner;

public class Euler35 {
  public static void main (String[] args) {
    Scanner scanDude = new Scanner (System.in);

    System.out.println("Enter a number to find all the circular primes less than that number: ");
    int max = scanDude.nextInt();

    int numberOfCircularPrimes = 13; //13 are given in the problem, all less than 100

    String s;
    int length = 0;

    int rotationPlaceholder = 0;

    boolean isCircularPrime = false;

    for(int testNum = 101; testNum < max; testNum += 2) {  //all 1 and 2 digit integers have been tested, also testNum is incremented by 2 because no even number can be prime
      if(hasNoEvenDigits(testNum)) //if it has even digits, one or more rotations of the number will be even, and therefore not prime
        if(isPrime(testNum)) {
          isCircularPrime = true; //assumes that it is, and if one of the rotations is not prime, this value will be set to false

          s = String.valueOf(testNum);
          length = s.length();

          rotationPlaceholder = rotate(testNum); //rotates the initial test value

          for(int k = 0; k < length - 1; k++) { //should run once for each rotation, assuming that the number of rotations possible is equal to the number of digits
            if(!(isPrime(rotationPlaceholder)))
              isCircularPrime = false;

            rotationPlaceholder = rotate(rotationPlaceholder);
          }

          if(isCircularPrime)
            numberOfCircularPrimes++;
        }
    }

    System.out.println(numberOfCircularPrimes);
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

  public static boolean hasNoEvenDigits(int n) { //this works
    String s = String.valueOf(n);
    int length = s.length();

    char testChar = 'a';
    int testDigit = 0;

    for(int j = 0; j < length; j++) {
      testChar = s.charAt(j);
      testDigit = Character.getNumericValue(testChar);

      if((testDigit % 2) == 0)
        return false;
    }

    return true; //only gets here if none of the ifs in the for loop execute, returning false
  }

  public static int rotate(int n) { //rotates to the left
    String s = String.valueOf(n);
    int length = s.length(); //should only be 3, 4, 5, or 6, since it is only under 1000000

    if(length == 3) {
      char[] digits = s.toCharArray();
      char[] rotatedChars = new char[3];

      rotatedChars[0] = digits[1];
      rotatedChars[1] = digits[2];
      rotatedChars[2] = digits[0];

      String finalString = new String(rotatedChars);
      return Integer.parseInt(finalString);
    }
    if(length == 4) {
      char[] digits = s.toCharArray();
      char[] rotatedChars = new char[4];

      rotatedChars[0] = digits[1];
      rotatedChars[1] = digits[2];
      rotatedChars[2] = digits[3];
      rotatedChars[3] = digits[0];

      String finalString = new String(rotatedChars);
      return Integer.parseInt(finalString);
    }
    if(length == 5) {
      char[] digits = s.toCharArray();
      char[] rotatedChars = new char[5];

      rotatedChars[0] = digits[1];
      rotatedChars[1] = digits[2];
      rotatedChars[2] = digits[3];
      rotatedChars[3] = digits[4];
      rotatedChars[4] = digits[0];

      String finalString = new String(rotatedChars);
      return Integer.parseInt(finalString);
    }
    if(length == 6) {
      char[] digits = s.toCharArray();
      char[] rotatedChars = new char[6];

      rotatedChars[0] = digits[1];
      rotatedChars[1] = digits[2];
      rotatedChars[2] = digits[3];
      rotatedChars[3] = digits[4];
      rotatedChars[4] = digits[5];
      rotatedChars[5] = digits[0];

      String finalString = new String(rotatedChars);
      return Integer.parseInt(finalString);
    }

    return 0;
  }
}
