class math1 {
  public int[] plusOne(int[] digits) {
    int least_significant = digits[0];
    int most_significant = digits[digits.length - 1];

    int n = digits.length;
    most_significant += 1;
    if (most_significant > 9) {
      least_significant = 1;
      most_significant = 0;
      int[] new_digits = new int[n + 1];
       new_digits[0] = 1;
        for (int i = 0; i < new_digits.length; i++) {
      System.out.print(new_digits[i]);
    }
    if (least_significant == 0) {
      new_digits[0] = 1;
    }
    // System.out.println(least_significant);
    // System.out.println(most_significant);
    return new_digits;
    }
    digits[digits.length - 1] = most_significant;
    for (int i = 0; i < digits.length; i++) {
      System.out.print(digits[i]);
    }
    return digits;
    
   
  }

  public static void main(String[] args) {
    math1 ob = new math1();
    ob.plusOne(new int[] { 9, 9, 9 });
    ob.plusOne(new int[] { 1, 2, 3 });
    ob.plusOne(new int[] { 1, 2, 3, 5 });

  }
}

// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's