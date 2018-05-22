package codingBat.recursion1;

public class Exe8Count8 {

/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */

    public int count8(int n) {
        if (n < 10) return n==8 ? 1 : 0;
        return n%10==8 ? (n/10)%10==8 ? 2 + count8(n/10) : 1 + count8(n/10) : count8(n/10);

    }

}
