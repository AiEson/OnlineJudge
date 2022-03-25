import java.util.ArrayList;
import java.util.List;

public class 找到所有数组中消失的数字 {
    public static void main(String[] args) {
        System.out.println(new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int posi = Math.abs(nums[i]) - 1;
                if (nums[posi] > 0)
                    nums[posi] *= -1;
            }
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) integers.add(i + 1);
            }
            return integers;
        }
    }
}
