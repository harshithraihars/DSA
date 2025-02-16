import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ReduceSizeHalf {
    public static int minSetSize(int[] arr) {
        int count=0;
        int mincount=1;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:arr){
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }else{
                hs.put(num,1);
            }
        }
    //     int numCount[]=new int[hs.size()];
    //     int i=0;
    //     for(Integer value:hs.values()){
    //         numCount[i++]=value;
    //     }
    //    Arrays.sort(numCount);
    //     int length=arr.length;
    //     for(int j=numCount.length-1;j>=0;j--){
    //         if(count+numCount[j]>=(int)length/2){
    //             System.out.println(mincount);
    //             return mincount;
    //         }
    //         count+=numCount[j];
    //         mincount+=1;
    //     }
    int numCount[]=new int[arr.length+1];
        int i=0;
        for(Integer value:hs.values()){
            numCount[value]++;
        }
       Arrays.sort(numCount);
        int length=arr.length;
        for(int j=numCount.length-1;j>=0;j--){
            if(numCount[j]>0){
                if(count+j>=(int)length/2){
                    System.out.println(mincount);
                    return mincount;
                }
                count+=j;
                mincount+=1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,3,3,3,5,5,5,2,2,7};
minSetSize(arr);
    }
}