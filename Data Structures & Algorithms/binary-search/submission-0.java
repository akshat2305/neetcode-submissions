class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target)
                return middle;
            if (target < nums[middle])
                right = middle - 1;
            if (target > nums[middle])
                left = middle + 1;
        }

        return -1;
    }
}