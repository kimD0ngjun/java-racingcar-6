package racingcar.domain.entity;

import static racingcar.domain.entity.Position;

public class Car {
    private final int MOVE = 1;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
        this.position = calculatePosition();
    }

    private int calculatePosition() {
        if (Move.isMove()) {
            this.position = this.position + MOVE;
        }
        return this.position;
    }
}
