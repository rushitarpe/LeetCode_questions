public class BinaryAddition {
    
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.insert(0, sum % 2);  // Append remainder
            carry = sum / 2;            // Update carry
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String binary1 = "111";  // 11 in decimal
        String binary2 = "001";  // 13 in decimal

        String sum = addBinary(binary1, binary2); // 24 -> "11000"

        System.out.println("Sum: " + sum);
    }
}
