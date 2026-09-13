

class Solution {

    public int subarraysDivByK(int[] nums, int k) {

        // Map will store:
        // remainder -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 initially occurs once.
        // This handles subarrays whose sum itself is divisible by k.
        map.put(0, 1);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            // Calculate prefix sum
            sum = sum + nums[i];

            // Find remainder of prefix sum
            int remainder = sum % k;

            // Java can give negative remainder
            // for negative numbers.
            // Example: -2 % 5 = -2
            // We need remainder in range [0, k-1].
            if (remainder < 0) {
                remainder = remainder + k;
            }

            // If this remainder has appeared before,
            // then those previous prefix sums form
            // subarrays divisible by k.
            if (map.containsKey(remainder)) {
                result = result + map.get(remainder);
            }

            // Increase the frequency of this remainder
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}