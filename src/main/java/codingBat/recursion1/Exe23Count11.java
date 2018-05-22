package codingBat.recursion1;

public class Exe23Count11 {

/*
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1

 */

    public int count11(String str) {
        if (str.length() < 2) return 0;
        int index = str.indexOf("11");
        if(index == -1) return 0;
        return 1 + count11(str.substring(index + 2));
    }

}
