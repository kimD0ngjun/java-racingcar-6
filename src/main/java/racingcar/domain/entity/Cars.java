package racingcar.domain.entity;

import java.util.List;
import racingcar.service.ListTypeChanger;

public class Cars {
    private List<Car> cars;

    public Cars(String cars) {
        this.cars = ListTypeChanger.changeListType(cars);
    }
}
