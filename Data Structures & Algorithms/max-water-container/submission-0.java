class Solution {
    public int maxArea(int[] heights) {

        int left = 0, right = heights.length - 1, maxWater = 0;

        while (left < right) {
            int shorter = Math.min(heights[left], heights[right]);
            int water = shorter * (right - left);

            if (water > maxWater) {
                maxWater = water;
            }

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}