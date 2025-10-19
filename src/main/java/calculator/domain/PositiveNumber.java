package calculator.domain;

public class PositiveNumber {

    private final int number;

    public PositiveNumber(String numberString) {
        // 빈 문자열 처리
        if (numberString.isEmpty()) {
            this.number = 0;
            return;
        }

        // 숫자 변환 및 NumberFormatException 처리
        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 이외의 문자('" + numberString + "')가 포함되었습니다.", e);
        }

        // 양수 검증 (음수 혹은 0 체크)
        if (parsedNumber < 1) {
            throw new IllegalArgumentException("음수 혹은 0은 입력할 수 없습니다.");
        }

        this.number = parsedNumber;
    }

    public int getNumber() {
        return number;
    }
}
