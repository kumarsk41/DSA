package dsa.SlidingWindowTwoPointers;

import java.util.HashSet;
import java.util.Set;


public class HappyNumberTwoPointers {

    public static int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);

            fast = getNext(fast);
            fast = getNext(fast);

        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {

        int n = 19;

        System.out.println(isHappy(n));
    }
}