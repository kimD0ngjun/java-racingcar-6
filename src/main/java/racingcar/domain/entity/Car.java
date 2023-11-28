package racingcar.domain.entity;

import racingcar.utility.CarNameValidator;

public class Car {

    private String name;

    Car(String name) {
        CarNameValidator.isValid(name);
        this.name = name;
    }
}
