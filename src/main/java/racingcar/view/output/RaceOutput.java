package racingcar.view.output;

import racingcar.domain.dto.CarDTO;
import racingcar.view.message.OutputMessage;

public class RaceOutput {
    public void message(CarDTO carDTO) {
        System.out.print(carDTO.getName() + OutputMessage.START_LINE.getMessage());
    }
}
