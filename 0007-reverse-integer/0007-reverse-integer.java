
class Solution {
    public int reverse(int x) {
        long rev = 0; // Use long to handle numbers that exceed 32-bit limits during reversal
        
        while (x != 0) {
            rev = rev * 10 + (x % 10); // Extract last digit and append it
            x = x / 10;                // Shrink the original number
        }
        
        // At the end, check if the result fits in a standard 32-bit integer range
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) rev; // Cast back to int safely
    }
}
