package codingBat.recursion1;

public class Exe22CountABC {

/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

 */

    public int countAbc(String str) {
        int indexABC = str.indexOf("abc");
        int indexABA = str.indexOf("aba");
        if (indexABC == indexABA) return 0;
        int index = indexABC > -1 && indexABA > -1 ? Math.min(indexABC, indexABA) :
                Math.max(indexABC, indexABA);
        return 1 + countAbc(str.substring( index+1));
    }

}
