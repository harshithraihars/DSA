import java.util.*;;
public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<List<Integer>> output=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int num:nums1){
            hs.put(num,1);
        }
        for(int num:nums2){
            if(!hs.containsKey(num)){
                l2.add(num);
                hs.put(num,0);
            }
            else{
                hs.put(num,0);
            }
        }

        for(Map.Entry<Integer,Integer> mp:hs.entrySet()){
            if(mp.getValue()>0){
                l1.add(mp.getKey());
            }
        }

        output.add(l1);
        output.add(l2);
        return output;

    }

    public static void main(String[] args) {
        int a1[]={1,2,3,3};
        int a2[]={1,1,2,2};
        System.out.println(findDifference(a1, a2));
    }
}
