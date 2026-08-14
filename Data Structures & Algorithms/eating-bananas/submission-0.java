class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int j = Arrays.stream(piles).max().getAsInt();
        int i = 1;

        while (i < j) {
            int speed = i + (j - i) / 2;
            long finishTime = 0;

            for (int pile : piles) {
                finishTime += (pile + speed - 1) / speed;
            }

            if (finishTime <= h) {
                j = speed;
            } else {
                i = speed + 1;
            }
        }

        return i;
    }
}