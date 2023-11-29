package racingcar;

import racingcar.controller.ControllerAssembler;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ControllerAssembler race = new ControllerAssembler();
        race.startRace();
    }
}
