package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.utility.CarNameValidator;

public class Car {
    private String name;

    public Car(String name) {
        CarNameValidator.isValid(name);
        this.name = name;
    }

    // for test-code and encapsulation
    public String getName() {
        return name;
    }
}
