public class Palliondrome{
    public static boolean CheckPalliondriome(String str){
        int right=str.length()-1;
        for(int left=0;left<=str.length()/2;left++){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String str="ababaa";
        System.out.println(CheckPalliondriome(str));
    }
}