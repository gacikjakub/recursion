package codingBat.recursion1;

public class Exe26ParenBit {

/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of
the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
  */


    public String parenBit(String str) {
        return str.charAt(0)=='(' ? str.charAt(str.length()-1)==')' ? str :
                parenBit(str.substring(0,str.length()-1)) :
                parenBit(str.substring(1,str.length())) ;
    }

}
