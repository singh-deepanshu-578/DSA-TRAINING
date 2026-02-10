import java.util.*;

public class reverse {
    public int reverseNumber(int n) {
        int revNum = 0;
        while (n > 0) {
            // Get the last digit
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        reverse obj = new reverse();
        int num = 12345;
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + obj.reverseNumber(num));
    }
}