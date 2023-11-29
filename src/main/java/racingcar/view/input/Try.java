package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.Message;

public class Try extends Input{
    @Override
    public String message() {
        System.out.println(Message.TRY);
        return Console.readLine();
    }}
