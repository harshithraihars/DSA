import java.util.ArrayList;

public class EncodeDecode {
    public static String Encode(String[] data){
        StringBuilder encodedString=new StringBuilder("");
        for(String str:data){
            encodedString.append(str.length()+"/"+str);
        }
        System.out.println(encodedString.toString());
        return encodedString.toString();
    }
    public static ArrayList<String> Decode(String str){
        ArrayList<String> decoded=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int slashedIndex=str.indexOf("/", i);
            int length=Integer.parseInt(str.substring(i, slashedIndex));
            decoded.add(str.substring(slashedIndex+1,slashedIndex+1+length));
            i=slashedIndex+1+length;
        }
        for(String st:decoded){
            System.out.println(st);
        }
        return decoded;
    }
    public static void main(String[] args) {
        String arr[]={
            "green","cat","age"
        };
        String decoded=Encode(arr);
        Decode(decoded);
    }
}
