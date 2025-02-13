public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while (i<m && j<n) {
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums2[i]=nums1[j];
                nums1[j]=temp;
                int count=j;
                while () {
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
    }
}
