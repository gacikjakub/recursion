package codingBat.recursion1;

public class Exe14NoX {

/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

 */

    public String noX(String str) {
        // return str.replace('x', '');
        int index = str.indexOf('x');
        if (index == -1) return str;
        return str.substring(0,index) + noX(str.substring(index+1));
    }

}
