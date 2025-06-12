import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        if(x<0)
        {
            return false;
        }
        int digit; 
        while(x != 0)
        {
           digit = x % 10;
           reverse = reverse * 10 + digit;
           x = x/10;
        }
        if( original == reverse ){
            return true;

        }
        else return false;
    }
    public static void main(String[] args)
    {
        Solution s = new Solution();
        s.isPalindrome(121);
        s.isPalindrome(-121);
        s.isPalindrome(10);
    }
    }