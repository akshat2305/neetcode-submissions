class Solution {
    public int lengthOfLongestSubstring(String str) {
        int left = 0, maxlen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);

            int window_size = right - left + 1;
            maxlen = Math.max(maxlen, window_size);
        }

        return maxlen;
    }
}