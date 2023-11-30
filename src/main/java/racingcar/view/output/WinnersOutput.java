package racingcar.view.output;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.dto.CarDTO;
import racingcar.domain.dto.CarsDTO;
import racingcar.domain.entity.Car;
import racingcar.view.message.OutputMessage;

public class WinnersOutput {
    private WinnersOutput() {
    }

    public static void message(CarsDTO carsDTO) {
        System.out.print(OutputMessage.WINNER.getMessage());
        System.out.println(convertToString(carsDTO));
    }

    private static String convertToString(CarsDTO carsDTO) {
        return carsDTO.getCars().stream()
                .map(Car::toDTO)
                .map(CarDTO::getName)
                .collect(Collectors.joining(OutputMessage.SEPERATOR.getMessage()));
    }
}
