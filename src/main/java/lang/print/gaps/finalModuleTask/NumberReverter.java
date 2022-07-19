package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            result = result * 10 + digit;
        }
        System.out.println(result);
    }
}
