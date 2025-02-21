public class CheckEvenOrOdd {
    public static boolean oddOrEven(int num) {
        int res = num & 1;
        if (res == 1) {
            return false;
        }
        return true;
    }

    public static void getIthBit(int num, int i) {
        int bitmap = 1 << i;
        int res = num & bitmap;
        if (res == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }

    public static int setInthNBit(int num, int i) {
        int bitmap = 1 << i;
        return num|bitmap;
    }
    public static int clearIthBit(int num, int i) {
        int bitmap = ~(1 << i);
        return num&bitmap;
    }
    public static int updateBit(int num, int i,int newbit) {
        num=clearIthBit(num, i);
        int bitmap=newbit<<i;
        return num|bitmap;
    }

    public static boolean isPowerofTwo(int num) {
        return (num&num-1)==0;
    }
    public static void main(String[] args) {
        // System.out.println(oddOrEven(4));
        // getIthBit(15, 4);
        // System.out.println(setInthNBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateBit(10, 2, 1));
        System.out.println(isPowerofTwo(8));
    }
}
