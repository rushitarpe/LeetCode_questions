class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits;
            }
            digits[i] = 0; 
        }

        
        int[] new_digits = new int[n + 1];
        new_digits[0] = 1; 

        return new_digits;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();

       
        int[] result1 = ob.plusOne(new int[]{1, 2, 3});
        printArray(result1);

        int[] result2 = ob.plusOne(new int[]{4, 3, 2, 1});
        printArray(result2);

        int[] result3 = ob.plusOne(new int[]{9});
        printArray(result3);
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println(); 
    }
}
