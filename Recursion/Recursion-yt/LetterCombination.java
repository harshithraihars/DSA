import java.util.HashMap;

public class LetterCombination {
    public static HashMap<Character, String> hs = new HashMap<>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public static void findPermuatation(String digit, String combination) {
        if (digit.length() == 0) {
            System.out.println(combination);
            return;
        }

        String possiblechoices=hs.get(digit.charAt(0));
        for(int i=0;i<possiblechoices.length();i++){
            findPermuatation(digit.substring(1), combination+possiblechoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        findPermuatation("23","");
    }
}
