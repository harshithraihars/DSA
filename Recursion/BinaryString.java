import java.util.HashMap;

public class BinaryString {
    public static void PrintBinaryString(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        PrintBinaryString(n-1,0, str+"0");
        if(last==0) PrintBinaryString(n-1,1, str+"1");
    }

    public static void FindOccurence(int arr[],int i,int val){
        if(i==arr.length){
            return;
        }
        if(arr[i]==val) System.out.println(i);
        FindOccurence(arr, i+1, val);
    }

    public static String ConvertNumberToString(HashMap<Integer,String> hs,int n,StringBuilder Str){
        if(n==0){
            return "";
        }
        ConvertNumberToString(hs,(int)Math.floor(n/10),Str);
        Str.append(hs.get(n%10)+" ");
        return Str.toString();
    }

    public static int LengthString(String str){
        if(str.length()==0){
            return 0;
        }
        return LengthString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        
        FindOccurence(arr, 0, 2);
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(0, "zero");
        hs.put(1, "one");
        hs.put(2, "two");
        hs.put(3, "three");
        hs.put(4, "four");
        hs.put(5, "five");
        hs.put(6, "six");
        hs.put(7, "seven");
        hs.put(8, "Eight");
        hs.put(9, "Nine");
        hs.put(10, "Ten");
        StringBuilder str=new StringBuilder("");
        System.out.println(ConvertNumberToString(hs,101010,str));
        System.out.println(LengthString("abc"));;
    }

    
}
