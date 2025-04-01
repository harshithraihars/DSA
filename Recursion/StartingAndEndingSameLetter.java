public class StartingAndEndingSameLetter {
    public static void FindString(String fullString,int i,char StartingChar,String str){
        if(i==fullString.length()){
            return;
        }
        if(fullString.charAt(i)==StartingChar){

            System.out.println(str+fullString.charAt(i));
        }
        FindString(fullString, i+1, StartingChar, str+fullString.charAt(i));
    }
    public static void main(String[] args) {
        String str="abcab";
        for(int i=0;i<str.length();i++){
            FindString(str, i,str.charAt(i),"");
        }
    }
}
