package racingcar.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.entity.Car;

public class ListTypeChangerTest {
    @DisplayName("입력값 Car List 변환 테스트")
    @Test
    void testListTypeChanger() {
        String testCars = "car1,car2,car3,car4";

        List<Car> carList = ListTypeChanger.changeListType(testCars);

        assertCarListEquals(List.of("car1", "car2", "car3", "car4"), carList);
    }

    private void assertCarListEquals(List<String> expect, List<Car> actual) {
        assertEquals(expect.size(), actual.size());

        for (int i = 0; i < expect.size(); i++) {
            assertEquals(expect.get(i), actual.get(i).getName());
        }
    }
}
