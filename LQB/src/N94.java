import java.util.Scanner;

public class N94 {
    static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dfs(1, n, "");
    }

    private static void dfs(int deep, int n, String str) {
        if (deep == n + 1) {
            System.out.println(str);
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] == -1) continue;
            arr[i] = -1;
            dfs(deep + 1, n, str + " " + i);
            arr[i] = i;
        }
    }
}
