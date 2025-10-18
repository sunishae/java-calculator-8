package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    private static final String DEFAULT_COLON = ":";
    private static final String DEFAULT_COMMA = ",";
    private static final String CUSTOM_PREFIX = "//";
    private static final String CUSTOM_SEPARATOR = "\\n";

    public String[] parse(String text) {
        String numberPart = text;
        List<String> delimiters = new ArrayList<>();

        // 기본 구분자 등록
        delimiters.add(DEFAULT_COMMA);
        delimiters.add(DEFAULT_COLON);

        // 커스텀 구분자 처리
        if (text.startsWith(CUSTOM_PREFIX)) {
            int index = text.indexOf(CUSTOM_SEPARATOR);

            String customDelimiter = text.substring(CUSTOM_PREFIX.length(), index);
            if (customDelimiter.length() != 1) {
                throw new IllegalArgumentException("커스텀 구분자는 한 문자여야 합니다.");
            }

            delimiters.add(customDelimiter);
            numberPart = text.substring(index + CUSTOM_SEPARATOR.length());
        }

        // 순회하며 숫자 추출 및 유효성 검증
        List<String> resultNumbers = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();

        for (char character : numberPart.toCharArray()) {
            String charStr = String.valueOf(character);

            if (delimiters.contains(charStr)) {
                // 유효한 구분자일 경우
                resultNumbers.add(currentNumber.toString());
                currentNumber.setLength(0);
            } else if (Character.isDigit(character) || character == '-') {
                // 숫자인 경우
                currentNumber.append(character);
            } else {
                throw new IllegalArgumentException("유효하지 않은 구분자가 사용되었습니다.");
            }
        }

        resultNumbers.add(currentNumber.toString());

        return resultNumbers.toArray(new String[0]);
    }
}
