package calculator.domain;

public class StringAddCalculator {

    private final StringParser parser;

    public StringAddCalculator() {
        this.parser = new StringParser();
    }

    // 문자열에서 숫자 리스트 파싱
    public int calculate(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        String[] numberStrings = parser.parse(text);

        return sum(numberStrings);
    }

    // 유효성 검사 및 덧셈
    public int sum(String[] numberStrings) {
        int sum = 0;
        for (String numberString : numberStrings) {
            PositiveNumber number = new PositiveNumber(numberString);
            sum += number.getNumber();
        }
        return sum;
    }
}
