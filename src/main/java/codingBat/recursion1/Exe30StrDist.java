package codingBat.recursion1;

public class Exe30StrDist {

/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9

 */

    public int strDist(String str, String sub) {
        // return str.lastIndexOf(sub) - str.indexOf(sub) + sub.length();
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub) ? str.endsWith(sub) ? str.length() :
                strDist(str.substring(0,str.length()-1), sub) :
                strDist(str.substring(1,str.length()), sub);
    }

}
