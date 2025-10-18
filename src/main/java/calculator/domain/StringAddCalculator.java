package calculator.domain;

public class StringAddCalculator {

    private final StringParser parser;

    public StringAddCalculator() {
        this.parser = new StringParser();
    }

    public int calculate(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        String[] numberStrings = parser.parse(text);

        return sum(numberStrings);
    }

    // 덧셈
    public int sum(String[] numberStrings) {
        int sum = 0;
        for (String numberString : numberStrings) {
            PositiveNumber number = new PositiveNumber(numberString);
            sum += number.getNumber();
        }
        return sum;
    }
}
