package racingcar.domain.entity;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;

public class CarTest {
    private static Car car1;
    private static Car car2;

    @BeforeAll
    static void setUp() {
        car1 = mock(Car.class);
        car2 = mock(Car.class);
    }
}
