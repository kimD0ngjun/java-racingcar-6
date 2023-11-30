package racingcar.controller;

import racingcar.view.input.CarNamesInput;
import racingcar.view.input.Input;
import racingcar.view.input.TryCountInput;

public class InputController {
    private InputController() {
    }

    public static String inputCarNames() {
        Input inputCarNames = new CarNamesInput();
        return inputCarNames.message();
    }

    public static String inputTryCount() {
        Input inputTryCount = new TryCountInput();
        return inputTryCount.message();
    }
}
