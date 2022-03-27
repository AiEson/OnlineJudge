import java.util.Arrays;

public class 找出缺失的观测数据 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().missingRolls(new int[]{3, 2, 4, 3}, 4, 2)));
    }
    static class Solution {
        public int[] missingRolls(int[] rolls, int mean, int n) {
            int sumR = 0;
            for (int roll : rolls) {
                sumR += roll;
            }
            int toN = mean * (n + rolls.length) - sumR;
            double doub = ((double)toN / (double) n);
            if (doub > 6 || doub < 1) return new int[]{};
            else {
                int[] ret = new int[n];
                int retMean = toN / n;
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = retMean;
                }
                for (int i = 0; i < (toN % n); i++) {
                    ++ret[i];
                }
                return ret;
            }
        }
    }
}
