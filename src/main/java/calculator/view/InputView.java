package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public String readInputText() {
        System.out.println(INPUT_MESSAGE);
        String input = Console.readLine();

        if (input == null) {
            return null;
        }
        return input.trim();
    }
}
