package racingcar.utility;

public class CarNameValidator {

    // to prevent instantiation
    private CarNameValidator() {
    }

    public static boolean isValid(String carName) {
        if (hasBlank(carName)) {
            return false;
        }
        return true;
    }

    private static boolean hasBlank(String carName) {
        if (carName.isBlank()) {
            return true;
        }

        for (char c : carName.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return true;
            }
        }

        return false;
    }
}
