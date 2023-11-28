package racingcar.domain.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @DisplayName("Car 객체 생성 테스트")
    @Test
    void testCarCreation() {
        String carName = "TestCar";

        Car car = new Car(carName);

        assertNotNull(car);
    }
}
