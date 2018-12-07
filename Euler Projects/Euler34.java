
public class Euler34 {
  public static void main (String[] args) {
   System.out.println("This program will find the sum of all numbers which are equal to the sum of the factorials of their digits. ");

   int limit = getFactorial(9) + getFactorial(8) + getFactorial(7) + getFactorial(6) + getFactorial(5) + getFactorial(4) + getFactorial(3) + 2 + 1;

   int factorialSumSum = 0;

   int factorialSumPlaceholder = 0;
   for(int j = 3; j <= limit; j++) {
     factorialSumPlaceholder = getFactorialSum(j, getLength(j));
     if(j == factorialSumPlaceholder)
      factorialSumSum += j;
   }

   System.out.println(factorialSumSum);
  }

  public static int getFactorial(int n) { //works
    int fact = 1;
    for(int i = n; i > 0; i--) { //increments 1 down at a time
      fact *= i;
    }

    return fact;
  }

  public static int getLength(int n) { //works
    String s = String.valueOf(n);
    return s.length();
  }

  public static int getFactorialSum(int n, int length) { //works
    int factSum = 0;

    String s = String.valueOf(n);

    char charPlaceholder;
    int digitPlaceholder = 0;
    for(int j = length; j > 0; j--) { //will add factorials of each digit, going from last to first
      charPlaceholder = s.charAt(j - 1);
      digitPlaceholder = Character.getNumericValue(charPlaceholder);

      factSum += getFactorial(digitPlaceholder);
    }

    return factSum;
  }
}
