import java.util.Arrays;

public class Euler52 {
  public static void main (String[] args) {
    System.out.println("This program will find the smallest intege x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.");

    int num = 1;
    int twoNum = 1;
    boolean found = false;

    while(!found) {
      twoNum = 2 * num;

      if(isAPermutationOf(twoNum, (3 * num)))
        if(isAPermutationOf(twoNum, (4 * num)))
          if(isAPermutationOf(twoNum, (5 * num)))
            if(isAPermutationOf(twoNum, (6 * num))) {
              found = true;
            }

      if(!found)
            num++;
    }

    System.out.println(num);
  }

  public static boolean isAPermutationOf(int original, int n1) { //haven't tested
    String s1 = String.valueOf(original);
    String s2 = String.valueOf(n1);

    if(s1.length() != s2.length())
      return false;

    if(sort(s1).equals(sort(s2)))
      return true;

    return false;
  }

  public static String sort(String s) { //haven't tested
    char digits[] = s.toCharArray();

    Arrays.sort(digits);
    return new String(digits);
  }
}
