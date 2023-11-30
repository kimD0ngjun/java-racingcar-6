package racingcar.service;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.dto.CarsDTO;
import racingcar.domain.entity.Car;
import racingcar.domain.entity.Cars;

public class WinnersFinder {
    private WinnersFinder() {
    }

    public static List<Car> findWinners(CarsDTO carsDTO) {
        List<Car> carList = carsDTO.getCars();

        return carList.stream()
                .filter(car -> carList.stream().allMatch(other -> car.comparePosition(other) >= 0))
                .collect(Collectors.toList());
    }
}
