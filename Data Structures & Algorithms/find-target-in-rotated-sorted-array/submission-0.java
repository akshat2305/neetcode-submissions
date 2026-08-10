class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target)
                return middle;

            if (nums[left] <= nums[middle]) {
                // left half is sorted
                if (nums[left] <= target && target <= nums[middle]) {
                    right = middle - 1;  // target in sorted left half
                } else {
                    left = middle + 1;   // target must be in right half
                }
            } else {
                // right half is sorted
                if (nums[middle] <= target && target <= nums[right]) {
                    left = middle + 1;   // target in sorted right half
                } else {
                    right = middle - 1;  // target must be in left half
                }
            }
        }

        return -1;
    }
}