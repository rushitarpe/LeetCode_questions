class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(3)); 
        System.out.println(solution.climbStairs(2)); 
        System.out.println(solution.climbStairs(5)); 
        System.out.println(solution.climbStairs(10));
    }
}
