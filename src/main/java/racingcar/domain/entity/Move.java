package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class Move {
    public static boolean isMove() {
        int move = Randoms.pickNumberInRange(0,9);
        return move >= 4;
    }
}
