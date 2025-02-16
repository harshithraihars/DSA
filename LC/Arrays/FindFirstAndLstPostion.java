public class FindFirstAndLstPostion {
    public static int specialBinary(int nums[],int left,int right,boolean dir,int target){
        int index=-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                if(dir){
                    right=mid-1;
                }else{
                    left=mid+1;
                }         
            }else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return index;
    }
    public static int[] findIndex(int nums[],int target){
        int found=-1;
        int left=0;
        int right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                found=mid;
                break;
            }else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        int arr[]=new int[2];
        if(found==-1){
            arr[0]=arr[1]=-1;
        }else{
            int leftIndex=specialBinary(nums,0,found,true, target);
            int rightIndex=specialBinary(nums,found,nums.length-1,false, target);
            arr[0]=leftIndex;
            arr[1]=rightIndex;
        }
        for(int num:arr){
            System.out.println(num);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        findIndex(arr, 8);
    }
}
