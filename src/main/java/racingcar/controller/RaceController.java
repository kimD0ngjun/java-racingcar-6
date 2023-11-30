package racingcar.controller;

import racingcar.domain.entity.Car;
import racingcar.domain.entity.Cars;
import racingcar.service.RaceUpdater;
import racingcar.view.message.OutputMessage;
import racingcar.view.output.RaceOutput;

public class RaceController {
    private RaceController() {
    }

    public static void performRace(Cars cars, int tryCount) {
        System.out.println(OutputMessage.RESULT.getMessage());

        RaceOutput output = new RaceOutput();

        for (int i = 0; i < tryCount; i++) {
            updateAndPrintRaceStatus(cars, output);
            System.out.println();
        }
    }

    private static void updateAndPrintRaceStatus(Cars cars, RaceOutput output) {
        for (Car car : cars.toDTO().getCars()) {
            car.updatePosition();
            output.message(car.toDTO());
            System.out.println(RaceUpdater.updateTrack(car.toDTO()));
        }
    }
}
