import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; 
        int product2 = nums[0] * nums[1] * nums[n - 1];         

        return Math.max(product1, product2);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {-1, -2, -3};

        System.out.println("Example 1 Output: " + s.maximumProduct(nums1)); 
        System.out.println("Example 2 Output: " + s.maximumProduct(nums2)); 
        System.out.println("Example 3 Output: " + s.maximumProduct(nums3)); 
    }
}
