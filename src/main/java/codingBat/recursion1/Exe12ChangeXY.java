package codingBat.recursion1;

public class Exe12ChangeXY {

/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

 */

    public String changeXY(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1) return str.equals("x") ? "y" : str;
        return str.charAt(0) == 'x' ? "y" + changeXY(str.substring(1)) : str.charAt(0) + changeXY(str.substring(1));
    }

}
