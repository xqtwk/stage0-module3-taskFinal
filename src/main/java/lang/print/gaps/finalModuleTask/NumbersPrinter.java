package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        try {
            boolean t = number > 0;
            System.out.println(t);
        }
        catch (ArithmeticException e) {
            number = 0;
        }
    }
}
