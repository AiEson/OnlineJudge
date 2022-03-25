import java.util.Scanner;

public class N92 {
    static int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs("", 1, n);
    }

    private static void dfs(String s, int deep, int n) {
        if (deep == n + 1) {
            System.out.println(s);
            return;
        }
        dfs(s + arr[deep] + " ", deep + 1, n);
        dfs(s, deep + 1, n);
    }
}
