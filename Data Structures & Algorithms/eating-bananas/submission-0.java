class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int middle = left + (right - left) / 2;

            long totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + middle - 1) / middle;  // ceil division
            }

            if (totalHours <= h) {
                right = middle;  // this speed works, try smaller
            } else {
                left = middle + 1;  // too slow, need faster
            }
        }

        return left;
    }
}