package calculator.domain;

public class StringAddCalculator {

    public int calculate(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

    }

    public int sum(String[] numberStrings) {
        int sum = 0;
        for (String numberString : numberStrings) {
            sum += Integer.parseInt(numberString);
        }
        return sum;
    }
}
