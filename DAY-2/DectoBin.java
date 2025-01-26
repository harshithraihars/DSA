public class DectoBin {
    public static void DectoBin(int number){
        int pow=0;
        int bin=0;
        while (number>0) {
            int rem=number%2;
            bin=bin+((int)(Math.pow(10, pow))*rem);
            number/=2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        DectoBin(9);
    }
}
