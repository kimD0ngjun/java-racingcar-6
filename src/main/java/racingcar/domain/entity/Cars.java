package racingcar.domain.entity;

import static racingcar.utility.CarNamesValidator.hasDuplicates;
import static racingcar.utility.CarNamesValidator.isValid;
import static racingcar.utility.ListConverter.convertToCars;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.dto.CarsDTO;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        isValid(carNames);
        hasDuplicates(carNames);
        this.cars = convertToCars(carNames);
    }

    public CarsDTO toDTO() {
        return new CarsDTO(cars);
    }
}
