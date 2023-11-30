package racingcar.controller;

import racingcar.domain.entity.Cars;

public class MainController {
    public void startRace() {
        Cars cars = new Cars(InputController.inputCarNames());
        String tryCount = InputController.inputTryCount();

        RaceController.performRace(cars, Integer.parseInt(tryCount));

        WinnerController.performWinner(cars);
    }
}
