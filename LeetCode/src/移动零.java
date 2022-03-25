import java.util.Arrays;

public class 移动零 {
    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0,1,0,3,12});
    }
    static class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null) return;
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    ++j;
                }
            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = 0;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

}
