
public class Euler47 {
  public static void main (String[] args) {
    System.out.println("This program will print the first of four consecutive integers to have 4 distinct prime factors. ");

    boolean fourConsecutive = false;
    int num = 647; //chain of three consecutive digits with 3 prime factors each ends at 646

    while(!fourConsecutive) {
      if(hasFourPrimeFactors(num))
        if(hasFourPrimeFactors(num + 1))
          if(hasFourPrimeFactors(num + 2))
            if(hasFourPrimeFactors(num + 3))
              fourConsecutive = true;

      num++;
    }

    System.out.println(num);
  }

  public static boolean isPrime(int n) { //works
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

  public static boolean hasFourPrimeFactors(int n) {
    int numberOfPrimeFactors = 0;

    for(int i = 2; i <= n; i++) {
      if((n % i) != 0)
        continue;
      numberOfPrimeFactors++;
      while(true) { //since any composite number can be divided into prime factors, this divides the prime factor out of the composite number to make things go faster
        n = n / i;
        if((n % i) != 0)
          break;
      }
    }

    if(numberOfPrimeFactors == 4)
      return true;

    return false;
  }
}
