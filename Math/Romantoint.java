class Solution1 {
  public int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = value(s.charAt(i));

            if (current < prevValue) {
                sum -= current;
            } else {
                sum += current;
            }

            prevValue = current;
        }
        return sum;
        }
    
    public static void main(String[] args){
        Solution1 sl = new Solution1();
        sl.romanToInt("III");
        sl.romanToInt("LVIII");
        sl.romanToInt("MCMXCIV");

    }
}