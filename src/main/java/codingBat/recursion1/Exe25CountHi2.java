package codingBat.recursion1;

public class Exe25CountHi2 {

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0

 */

    public int countHi2(String str) {
        int index = str.indexOf("hi");
        if (index == -1) return 0;
        return index -1 >=0 && str.charAt(index-1)=='x' ?
                countHi2(str.substring(index+1)) : 1 + countHi2(str.substring(index+1));
    }

}
