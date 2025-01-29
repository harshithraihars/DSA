public class RemoveDuplicateFromArray {
    public static int removeDuplicate(int nums[]){
    int k=1;
    if(nums.length>1){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                k++;
                nums[k-1]=nums[i];
            }
        }
        return k;
    }
    return nums.length;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        removeDuplicate(nums);
    }
}
