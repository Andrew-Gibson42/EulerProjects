
public class Euler40 {
  public static void main (String[] args) {

    double i = 1;
    double irrationalLength = 0;
    double product = 1;

    boolean ten = false,
            hundred = false,
            thousand = false,
            tenThousand = false,
            hundredThousand = false;

    int distance = 0;

    while(true) {
      irrationalLength += getDigits(i);

      if(!ten) { //looks for 10
        if(irrationalLength >= 10) {
          distance = 10 - getDigits(i-1);

          product *= getNthDigitOf(i, distance);

          ten = true;
        }
      }

      if(ten) { //looks for 100
        if(irrationalLength >= 100) {
          distance = 100 - getDigits(i-1);

          product *= getNthDigitOf(i, distance); //issue is that one "getNthDigitOf" is returning 0
          ten = false;
          hundred = true;
        }
      }

      if(hundred) {
        if(irrationalLength >= 1000) {
          distance = 1000 - getDigits(i-1);

          product *= getNthDigitOf(i, distance);

          hundred = false;
          thousand = true;
        }
      }

      if(thousand) {
        if(irrationalLength >= 10000) {
          distance = 10000 - getDigits(i-1);

          product *= getNthDigitOf(i, distance);

          thousand = false;
          tenThousand = true;
        }
      }

      if(tenThousand) {
        if(irrationalLength >= 100000) {
          distance = 100000 - getDigits(i-1);

          product *= getNthDigitOf(i, distance);

          tenThousand = false;
          hundredThousand = true;
        }
      }

      if(hundredThousand) { //looks for one million
        if(irrationalLength >= 1000000) {
          distance = 1000000 - getDigits(i-1);

          product *= getNthDigitOf(i, distance);

          break;
        }

      i++;
      }
    }

    System.out.println(product);

  }

  public static int getDigits (double number) {
    if (number < 100000) {
      if (number < 100) {
        if (number < 10) {
            return 1;
        } else {
            return 2;
        }
    } else {
        if (number < 1000) {
            return 3;
        } else {
            if (number < 10000) {
                return 4;
            } else {
                return 5;
            }
        }
      }
    }
    else {
      if (number < 10000000) {
        if (number < 1000000) {
            return 6;
        } else {
            return 7;
        }
    } else {
        if (number < 100000000) {
            return 8;
        } else {
            if (number < 1000000000) {
                return 9;
            } else {
                return 10;
            }
        }
      }
    }
  }

  public static double getNthDigitOf (double num, int index) {
    for(int j = 0; j < index; j++)
      num = num / 10;
    return (num % 10);
  }
}
