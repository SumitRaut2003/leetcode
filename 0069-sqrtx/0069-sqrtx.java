public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use long to prevent overflow in mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;         // store the last valid mid
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));  // Output: 2
        System.out.println(solution.mySqrt(8));  // Output: 2
    }
}
