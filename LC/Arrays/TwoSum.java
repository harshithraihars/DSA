import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static int[] hashmap(int arr[],int target){
        HashMap <Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int required=target-arr[i];
            if(hm.containsKey(required)){
                int res[]={i,hm.get(required)};
                return res;
            }
            hm.put(arr[i],i);
        }
        return null;
    }
    public static void main(String args[]){
        // int arr[]={2,7,11,15};
        // hashmap(arr, 9);

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,1);
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }
        
    }
}