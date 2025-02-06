public class CompressString {

    // my code
    // public static String Compress(String str){
    // Integer count=1;
    // StringBuilder sb=new StringBuilder("");
    // sb.append(str.charAt(0));
    // for(int i=1;i<str.length();i++){
    // if(str.charAt(i)==str.charAt(i-1)){
    // count++;
    // }else{
    // if(count>1){
    // sb.append(count);
    // }
    // sb.append(str.charAt(i));
    // count=1;
    // }
    // }
    // if(count>1){
    // sb.append(count);
    // }
    // return sb.toString();
    // }

    // for leet code on eapna college solution but using arrays

    public static int Compress(char chars[]) {
        // int k=0;
        // for(int i=0;i<arr.length;i++){
        // int count=1;
        // while (i<arr.length-1 && arr[i]==arr[i+1]) {
        // count++;
        // i++;
        // }
        // arr[k++]=arr[i];
        // if(count>1){
        // String scount=count+"";
        // int j=0;
        // while (j<scount.length()) {
        // arr[k++]=(char) scount.charAt(j);
        // j++;
        // }
        // }
        // }
        // return k;

        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            int count = 1;

            // Count occurrences of consecutive identical characters
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Store the current character
            chars[k++] = chars[i];

            // Append count as digits if greater than 1
            if (count > 1) {
                // Directly place digits of the count
                char[] countDigits = Integer.toString(count).toCharArray();
                for (char digit : countDigits) {
                    chars[k++] = digit;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        // System.out.println(Compress("aabbc"));
        char arr[] = { 'a', 'a', 'b', 'b' };
        System.out.println(Compress(arr));
        // System.out.println((char) (12+'0'));
    }
}
