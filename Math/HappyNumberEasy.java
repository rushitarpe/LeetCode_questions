public class HappyNumberEasy {

    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getSquareSum(n);
        }
        return n == 1;
    }

    public static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 19;

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number!");
        } else {
            System.out.println(num + " is NOT a Happy Number.");
        }
    }
}
