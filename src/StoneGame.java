import java.util.*;
public class StoneGame {
    public static int minSteps (int n, int[] nums) {
        int min = nums[0];
        int minIdx = 0;
        int max = nums[0];
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            // System.out.println("nums[" + i + "]:" + nums[i]);
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        // System.out.println("Max:" + max + ", maxIdx:" + maxIdx + ", min:" + min + ", minIdx:" + minIdx);
        // System.out.println("Math.max(minIdx, maxIdx) + 1" + (Math.max(minIdx, maxIdx) + 1));
        // System.out.println("Math.max(n - minIdx, n - maxIdx)" + (Math.max(n - minIdx, n - maxIdx)));
        return Math.min(Math.min(Math.max(minIdx, maxIdx) + 1, Math.max(n - minIdx, n - maxIdx)), Math.min(minIdx, maxIdx) + 1 + n - Math.max(minIdx, maxIdx));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        // System.out.println("t:" + t);
        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(minSteps(n, nums));
        }
        scanner.close();
    }
}
