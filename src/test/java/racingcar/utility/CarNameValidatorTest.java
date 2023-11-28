package racingcar.utility;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameValidatorTest {
    @DisplayName("자동차 명칭 공백 포함 여부 테스트")
    @Test
    void testBlankCase() {
        String[] wrongCases = {"", " ", "car ", "c ar", " car"};

        for (String wrongName : wrongCases) {
            assertThrows(IllegalArgumentException.class, () -> CarNameValidator.isValid(wrongName));
        }
    }

    @DisplayName("자동차 명칭 특수 문자 포함 여부 테스트")
    @Test
    void testSpecialCharacterCase() {
        String[] wrongCases = {",", "!car", "ca>r", "(car)", "c-ar", ".car."};

        for (String wrongName : wrongCases) {
            assertThrows(IllegalArgumentException.class, () -> CarNameValidator.isValid(wrongName));
        }
    }
}
