package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.Message;

public class CarNames extends Input{
    @Override
    public void message() {
        System.out.println(Message.CAR_NAME);
        Console.readLine();
    }
}
