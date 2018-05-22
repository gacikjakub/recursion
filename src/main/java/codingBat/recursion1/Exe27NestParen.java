package codingBat.recursion1;

public class Exe27NestParen {

/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.


nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false

 */

    public boolean nestParen(String str) {
        int indexF = str.indexOf('(');
        int indexL = str.lastIndexOf(')');
        if (indexF == indexL && str.equals("")) return true;
        if (indexF == -1 || indexL == -1) return false;
        return nestParen(str.substring(indexF+1, indexL));
    }

}
