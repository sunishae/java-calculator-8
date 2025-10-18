package calculator.domain;

public class PositiveNumber {

    private final int number;

    public PositiveNumber(String numberString) {
        if (numberString.isEmpty()) {
            this.number = 0;
            return;
        }

        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 이외의 문자('" + numberString + "')가 포함되었습니다.", e);
        }

        if (parsedNumber < 1) {
            throw new IllegalArgumentException("음수 혹은 0은 입력할 수 없습니다.");
        }

        this.number = parsedNumber;
    }

    public int getNumber() {
        return number;
    }
}
