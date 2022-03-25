public class 阶乘后的零 {
    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes(50));
    }
    static class Solution {
        public int trailingZeroes(int n) {
            int ans=0;
            while(n!=0){
                n/=5;
                ans+=n;
            }
            return ans;
        }
    }
}
