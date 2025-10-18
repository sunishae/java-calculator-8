package calculator.controller;

import calculator.domain.StringAddCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final StringAddCalculator calculator;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.calculator = new StringAddCalculator();
    }

    public void run() {
        // 1. 입력 받기
        String inputText = inputView.readInputText();

        // 2. 계산
        int result = calculator.calculate(inputText);

        // 3. 출력
        outputView.printResult(result);
    }
}
