public class LargestSubString {
    public static void main(String[] args) {
        String arr[]={"apple","banana","mango","orange","grapes"};
        String longest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(longest.compareTo(arr[i])<0){
                longest=arr[i];
            }
        }
        System.out.println(longest);
    }
}
