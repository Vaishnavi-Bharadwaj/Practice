public class FindMinDigit {
    public static int findMinimumDigit(int number) {
        int minDigit = 9; // Initialize with the maximum possible digit
        while (number > 0) {
            int digit = number % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }
        return minDigit;
    }
}
