package racingcar.domain.dto;

import java.util.List;
import racingcar.domain.entity.Car;

public class CarsDTO {
    private List<Car> cars;

    public CarsDTO(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
