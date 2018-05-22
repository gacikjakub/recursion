package codingBat.recursion1;

public class Exe20EndX {

/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"

 */

    public String endX(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1) return str;
        return str.charAt(0)=='x' ? endX(str.substring(1)) + 'x' :
                str.charAt(0) +endX(str.substring(1));
    }

}
