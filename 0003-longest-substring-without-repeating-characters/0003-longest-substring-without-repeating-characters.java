class Solution {
    public int lengthOfLongestSubstring(String s) {
    int low = 0;
    int maxLen = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (int high = 0; high < s.length(); high++) {
        char ch = s.charAt(high);

        if (map.containsKey(ch)) {
            low = Math.max(low, map.get(ch) + 1);
        }

        map.put(ch, high);

        maxLen = Math.max(maxLen, high - low + 1);
    }

    return maxLen;
}
}