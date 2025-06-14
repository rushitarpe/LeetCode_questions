public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            result.insert(0, c);  
            columnNumber = columnNumber / 26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println("Column Title: " + convertToTitle(num)); 
    }
}
