public class KokoEatBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
for (int pile : piles) {
    max = Math.max(max, pile);
}
int left = 1;
int right = max;
int res = right;

while (left <= right) {
    int mid = left + (right - left) / 2;
    int total_hour = 0;
    for (int pile : piles) {
        total_hour += (int) Math.ceil((double) pile / mid); // Using Math.ceil()
    }
    if (total_hour <= h) {
        res = mid;
        right = mid - 1;
    } else {
        left = mid + 1;
    }
}
return res;



    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        KokoEatBanana k = new KokoEatBanana();
        System.out.println(k.minEatingSpeed(piles, h));
    }
}