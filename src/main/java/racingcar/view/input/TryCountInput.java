package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.message.InputMessage;

public class TryCountInput implements Input{
    @Override
    public String message() {
        System.out.println(InputMessage.TRY_COUNT.getMessage());
        return Console.readLine();
    }}
