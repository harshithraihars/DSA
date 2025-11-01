public class NumberOfEvenNumber{
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
            if(Integer.toString(num).length()%2==0){
                even+=1;
            }
        }
        return even;
    }
    public static void main(String[] args) {
        
    }
}