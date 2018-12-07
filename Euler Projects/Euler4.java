
public class Euler4 {
  public static void main(String[] args) {
    System.out.println("This program will find the largest palindrome product made from two 3-digit integers.");

    int greatestProduct = 0;

    for(int j = 100; j < 1000; j++) {
      for(int l = 100; l < 1000; l++) {
        if(isPalindromic(j * l))
          if(greatestProduct < (j * l))
            greatestProduct = j * l;
      }
    }

    System.out.println(greatestProduct);
  }

  public static boolean isPalindromic(int product) {
    String s = String.valueOf(product);
    int length = s.length();

    if(length == 1)
      return true;

    int index1 = 0,
        index2 = length - 1;
    boolean palindromic = true;
    while(true) {
      if(s.charAt(index1) == s.charAt(index2)) {
        index1++;
        index2--;
      }
      else {
        palindromic = false;
        break;
      }

      if(index1 == index2 || (index2 - index1) == -1) { //breaks if there's only 1 number left (as in, nothing to compare to)
        break;
      }
    }

    return palindromic;
  }
}
