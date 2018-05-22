package codingBat.recursion1;

public class Exe13ChangePi {

/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */

    public String changePi(String str) {
        int index = str.indexOf("pi");
        if ( index == -1 ) return str;
        return str.substring(0, index) + "3.14" + changePi(str.substring(index+2));
    }

}
