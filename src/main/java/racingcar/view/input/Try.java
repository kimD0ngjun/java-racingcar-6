package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.Message;

public class Try extends Input{
    @Override
    public void message() {
        System.out.println(Message.TRY);
        Console.readLine();
    }}
