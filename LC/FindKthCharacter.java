public class FindKthCharacter {
    public static char Solve(int k) {
        String word = "a";
        int i = 1;
        while (i < k) {
            int devider = Integer.highestOneBit(i);
            int index = i % devider;
            char currentChar = word.charAt(index);
            char newChar = (char) (currentChar + 1);
            word = word + newChar;
            i++;
        }
        return word.charAt(k - 1);
    }

    public char kthCharacter(int k) {
        if (k == 1)
            return 'a';

        int highestOneBit = Integer.highestOneBit(k - 1);
        int index = (k - 1) % highestOneBit;

        char ch = kthCharacter(index + 1);
        return (char) (ch + 1);
    }

    public static void main(String[] args) {

    }
}
