
public class DiceProblem {

    public static void Dice(int target, String str) {
        if (target == 0) {
            System.out.println(str);
            return;
        }
        for (int i = 1;(i<6 && i<=target); i++) {
            Dice(target - i, str +i);
        }
    }

    public static void main(String[] args) {
        Dice(4, "");
    }
}
