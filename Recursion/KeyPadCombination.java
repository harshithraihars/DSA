public class KeyPadCombination {
    public static String[] keypad={
        ".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };
    public static void printCombination(String str,int i,String combination){
        if(i==str.length()){
            System.out.println(combination);
            return;
        }
        String present=keypad[str.charAt(i)-'0'];
        for(int j=0;j<present.length();j++){
            printCombination(str, i+1, combination+present.charAt(j));
        }
    }
    public static void main(String[] args) {
        printCombination("23", 0,"");
    }
}
