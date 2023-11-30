package racingcar.controller;

import java.util.List;
import racingcar.domain.dto.CarsDTO;
import racingcar.domain.entity.Car;
import racingcar.domain.entity.Cars;
import racingcar.service.WinnersFinder;
import racingcar.view.output.WinnersOutput;

public class WinnerController {
    private WinnerController() {
    }

    public static void performWinner(Cars cars) {
        List<Car> winners = WinnersFinder.findWinners(cars.toDTO());
        CarsDTO winnersList = new CarsDTO(winners);
        WinnersOutput.message(winnersList);
    }
}
