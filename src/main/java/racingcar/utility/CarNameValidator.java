package racingcar.utility;

public class CarNameValidator {
    private static final String SPECIAL_CHARACTER = ".*[!@#$%^&*(),.?\":{}|<>\\-'`].*";

    // to prevent instantiation
    private CarNameValidator() {
    }

    public static boolean isValid(String carName) {
        if (hasBlank(carName) || hasSpecialCharacter(carName)) {
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

    private static boolean hasSpecialCharacter(String carName) {
        return carName.matches(SPECIAL_CHARACTER);
    }
}
