package racingcar.utility;

public class CarNameValidator {
    private static final String SPECIAL_CHARACTER = ".*[!@#$%^&*(),.?\":{}|<>\\-'`].*";

    // to prevent instantiation
    private CarNameValidator() {
    }

    public static boolean isValid(String carName) {
        if (hasBlank(carName) || hasSpecialCharacter(carName)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean hasBlank(String carName) {
        if (carName.isBlank()) {
            throw new IllegalArgumentException();
        }

        for (char c : carName.toCharArray()) {
            if (Character.isWhitespace(c)) {
                throw new IllegalArgumentException();
            }
        }

        return false;
    }

    private static boolean hasSpecialCharacter(String carName) {
        if (carName.matches(SPECIAL_CHARACTER)) {
            throw new IllegalArgumentException();
        }

        return false;
    }
}
