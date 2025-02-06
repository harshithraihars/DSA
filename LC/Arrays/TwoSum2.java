

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                int arr[]={left,right};
                System.out.println(left+""+right);
                
                return arr;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        twoSum(arr, 9);
    }
}
