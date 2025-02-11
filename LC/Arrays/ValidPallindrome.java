public class ValidPallindrome {
    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while (left < right) {
            int leftchar = Character.toLowerCase(s.charAt(left));
            int rightchar = Character.toLowerCase(s.charAt(right));
        
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(leftchar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightchar)) {
                right--;
                continue;
            }
        
            // Compare characters
            if (leftchar != rightchar) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s=new String("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome(s));
    }
}
