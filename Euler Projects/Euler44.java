
public class Euler44 {
  public static void main (String[] args) {
    System.out.println("This program will will find D = abs(Pk - Pj), where Pk and Pj are pentagonal numbers with a pentagonal sum and difference. ");

    int j = 1;
    boolean pairFound = false;

    int kFinal = 0;

    while(!pairFound) {
      if(isPentagonal(j)) { //if first number is pentagonal
        for(int k = 1; k < j; k++) { //will only search numbers below j, because j - k needs to be positive
          if(isPentagonal(k)) { //if second number is pentagonal
            if(isPentagonal(j - k)) { //if difference is pentagonal
              if(isPentagonal(j + k)) { //if sum is pentagonal
                pairFound = true;
                kFinal = k;
                break;
              }
            }
          }
        }
      }

      if(!pairFound)
        j++;
    }

    System.out.println(-1 * (kFinal - j));
  }

  public static boolean isPentagonal(int pN) { //works (I think)
    double dPN = (double) pN;
    double n = ((1 + Math.sqrt(1 + (24 * dPN))) / 6); //won't be negative, so only the positive part of the inverse function can be used

    if(Math.round(n) == n)
      return true;

    return false;
  }
}
