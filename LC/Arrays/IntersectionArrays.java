import java.util.*;
public class IntersectionArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums1){
            hs.add(num);
        }
        int n1=hs.size();
        for(int num:nums2){
            if(hs.contains(num)){
                hs.remove(num);
            }
        }
        int arr[]=new int[n1-hs.size()];
        int i=0;
        for(int num:nums1){
            if(!hs.contains(num)){
                arr[i++]=num;
                hs.add(num);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        IntersectionArrays ia=new IntersectionArrays();
        int res[]=ia.intersection(nums1,nums2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
