package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.Message;

public class CarNames extends Input{
    @Override
    public String message() {
        System.out.println(Message.CAR_NAME);
        return Console.readLine();
    }
}
