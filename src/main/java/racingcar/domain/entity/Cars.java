package racingcar.domain.entity;

import java.util.List;
import racingcar.service.ListConverter;

public class Cars {
    private List<Car> cars;

    public Cars(String cars) {
        this.cars = ListConverter.changeListType(cars);
    }
}
