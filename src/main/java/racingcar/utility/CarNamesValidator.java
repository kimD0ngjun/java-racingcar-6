package racingcar.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import racingcar.domain.entity.Car;

public class CarNamesValidator {
    private CarNamesValidator() {
    }

    public static void isValid(String carNames) {
        if (carNames == null || carNames.isBlank() || carNames.charAt(carNames.length() - 1) == ',') {
            throw new IllegalArgumentException("잘못 입력함");
        }
    }

    public static void hasDuplicates(String carNames) {
        List<String> namesList = Arrays.stream(carNames.split(","))
                .map(String::trim)
                .toList();

        Set<String> uniqueNames = new HashSet<>();

        List<Car> cars = namesList.stream()
                .filter(uniqueNames::add) // 중복 체크
                .map(Car::new)
                .collect(Collectors.toList());

        if (namesList.size() != cars.size()) {
            throw new IllegalArgumentException("자동차 중복 입력 안됨");
        }
    }
}
