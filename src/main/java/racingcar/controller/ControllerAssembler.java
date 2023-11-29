package racingcar.controller;

import java.util.List;
import racingcar.domain.entity.Car;
import racingcar.domain.entity.Cars;
import racingcar.view.input.CarNames;
import racingcar.view.input.Try;

public class ControllerAssembler {
    public void startRace() {
        CarNames inputCars = new CarNames();
        String carNames = inputCars.message();
        Try inputAccount = new Try();
        String tryAccount = inputAccount.message();

        Cars cars = new Cars(carNames);
        System.out.println("\n실행 결과");
        for(int i = 0; i < Integer.parseInt(tryAccount); i++) {
            cars.updateRace();
            System.out.println();
        }

        List<Car> winners = cars.findWinners();
        winners.forEach(car -> System.out.println(car.getName()));
    }
}
