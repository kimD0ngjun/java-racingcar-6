package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashMap;
import java.util.Map;

public class Car {
    private Map<String, Integer> car = new HashMap<>();

    public Car(String carName) {
        this.car = setRacingCar(carName);
    }

    private Map<String, Integer> setRacingCar(String carName) {
        car.put(carName, 0);
        return car;
    }

    public void isMove() {
        int forward = Randoms.pickNumberInRange(0, 9);
        if (forward >= 4) {
            updatePosition();
        }
    }

    private void updatePosition() {
        String carName = car.keySet().iterator().next();
        int currentPosition = car.get(carName);
        car.put(carName, currentPosition + 1);
    }

    // 등수 비교용
    public int comparePosition(Car other) {
        int thisPosition = car.get(car.keySet().iterator().next());
        int otherPosition = other.car.get(other.car.keySet().iterator().next());
        return thisPosition - otherPosition;
    }
}
