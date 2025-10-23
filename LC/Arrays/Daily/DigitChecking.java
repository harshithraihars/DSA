// You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:

// For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
// Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
// Return true if the final two digits in s are the same; otherwise, return false.

package Daily;

public class DigitChecking {
    public boolean hasSameDigits(String s) {
        StringBuilder str=new StringBuilder(s);
        int len=s.length();
        while(len!=2){
            int i=0;
            while(i<len-1){
                int first=Integer.valueOf(str.charAt(i));
                int second=Integer.valueOf(str.charAt(i+1));
                
                int sum=(first+second)%10;
                str.setCharAt(i,(char)('0'+sum));

                i++;
            }
            len--;
        }

        return str.charAt(0)==str.charAt(1);
    }
}
