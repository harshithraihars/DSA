public class TowerOfHanoi {
    public static void TowerOfHenoi(int n,String src,String helper,String Dest){
        if(n==1){
            System.out.println("Trnsfered Disk "+n+" from "+src+" to "+Dest);
            return;
        }
        TowerOfHenoi(n-1,src,Dest,helper);
        System.out.println("Trnsfered Disk "+n+" from "+src+" to "+Dest);
        TowerOfHenoi(n-1, helper, src, Dest);
    }
    public static void PrintStringReverse(String str,int i){
        if(i==str.length()){
            return;
        }
        PrintStringReverse(str, i+1);
        System.out.print(str.charAt(i));
    }
    public static void main(String[] args) {
       TowerOfHenoi(2, "S", "H", "D"); 
       PrintStringReverse("hello", 0);
    }
}
