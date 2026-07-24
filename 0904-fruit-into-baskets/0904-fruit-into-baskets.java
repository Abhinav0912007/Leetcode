class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0;
        int maxlen = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) + 1);

            while (freq.size() > 2) {
                int leftfruit = fruits[low];
                freq.put(leftfruit, freq.get(leftfruit) - 1);

                if (freq.get(leftfruit) == 0) {
                    freq.remove(leftfruit);
                }

                low++;   // Always move the left pointer
            }

            maxlen = Math.max(maxlen, high - low + 1);
        }

        return maxlen;
    }
}