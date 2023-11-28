package racingcar.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.entity.Car;

public class ListTypeChanger {
    public static List<Car> changeListType(String cars) {
        if(cars.isBlank()) {
            throw new IllegalArgumentException();
        }

        return Arrays.stream(cars.split(","))
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
