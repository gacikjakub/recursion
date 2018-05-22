package codingBat.recursion1;

public class Exe11CountHi {

/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

 */

    public int countHi(String str) {
        if (str.indexOf("hi") == -1) return 0;
        return 1 + countHi(str.substring(str.indexOf("hi")+1));
    }

}
