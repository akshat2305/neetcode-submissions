class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

    for (String word : strs) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String signature = new String(chars);

        map.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
    }

    return new ArrayList<>(map.values());
        
    }
}
