class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        for (int i = 1; i <= x / 2; i++) {
            if (i * i == x)
                return i;
            if (i * i > x)
                return i - 1;
        }

        return x / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(5));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(10));
    }
}
