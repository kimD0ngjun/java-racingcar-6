package racingcar.domain.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        this.cars = convertToCars(carNames);
    }

    private static List<Car> convertToCars(String carNames) {
        if (carNames == null || carNames.isBlank() || carNames.charAt(carNames.length() - 1) == ',') {
            throw new IllegalArgumentException("잘못 입력함");
        }

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

        return cars;
    }

    // 모든 자동차들 트랙 그려내기
    public void updateRace() {
        for (Car car: cars) {
            car.updatePosition();
            System.out.println(car.getName() + " : " + car.getTrack());
        }
    }

    // 맨 마지막에 1등 자동차 뽑기
    public List<Car> findWinners() {
        return cars.stream()
                .filter(car -> cars.stream().allMatch(other -> car.comparePosition(other) >= 0))
                .collect(Collectors.toList());
    }
}
