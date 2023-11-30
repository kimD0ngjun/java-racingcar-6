package racingcar.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.entity.Car;

public class ListConverter {
    public static List<Car> convertToCars(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
