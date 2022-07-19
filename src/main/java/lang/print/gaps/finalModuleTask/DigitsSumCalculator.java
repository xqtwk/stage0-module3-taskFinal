package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            result += digit;
        }
        System.out.println(result);
    }
}
