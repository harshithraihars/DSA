public class MissingNumber {
    public static void main(String[] args) {
        int nums[]={9,6,4,2,3,5,7,0,1};
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums.length || nums[i]==i){
                i++;
            }else{
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
            
        }
        for(i=0;i<nums.length;i++){
        if(nums[i]!=i){
            System.out.println(i);
            break;
        }}
        System.out.println(nums.length);
    }
}
