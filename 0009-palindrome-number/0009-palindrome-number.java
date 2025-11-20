class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        // Also numbers ending with 0 but not equal to 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse half the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even digits: x == reversed
        // For odd digits: x == reversed/10
        return (x == reversed || x == reversed / 10);
    }
}
