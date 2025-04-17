public class SubsetAndPattern {

    public static void Removea(String str,StringBuilder neews,int i){
        if(i==str.length()){
            System.out.println(neews.toString());
            return;
        }
        if(str.charAt(i)=='a'){
            Removea(str, neews, i+1);
        }
        else{
            Removea(str, neews.append(str.charAt(i)), i+1);
        }
    }

    // pasing in the function body
    public static String Removea(String str,int i){
        if(i==str.length()){
            return "";
        }
        String res=Removea(str, i+1);
        if(str.charAt(i)=='a'){
            return res;
        }
        return str.charAt(i)+res;
        
    }

    public static void RemoveApplie(String str,String news){
        if(str.isEmpty()){
            System.out.println(news);
            return;
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            RemoveApplie(str.substring(3), news);
        }else{
            RemoveApplie(str.substring(1), news+str.charAt(0));

        }
        
        
    }
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("");
        // Removea("baccad", st, 0);
        System.out.println(Removea("baccad", 0));
        RemoveApplie("bcappede","");
    }
}
