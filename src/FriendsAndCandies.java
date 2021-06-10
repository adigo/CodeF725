import java.util.*;
public class FriendsAndCandies {
    public static int minPick(int n, int[] nums) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        if (sum % n != 0)
            return -1;
        int goal = sum / n;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > goal)
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        // System.out.println("t:" + t);
        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(minPick(n, nums));
        }
        scanner.close();
    }
}
