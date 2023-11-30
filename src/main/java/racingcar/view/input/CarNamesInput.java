package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.InputMessage;

public class CarNamesInput implements Input{
    @Override
    public String message() {
        System.out.println(InputMessage.CAR_NAME.getMessage());
        return Console.readLine();
    }
}
