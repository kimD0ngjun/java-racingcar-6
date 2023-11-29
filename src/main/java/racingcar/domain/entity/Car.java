package racingcar.domain.entity;

import static racingcar.utility.CarNameValidator.isValid;

import camp.nextstep.edu.missionutils.Randoms;

// 자동차 객체의 역할은 오로지 자동차의 이름과 움직이냐는 기능
// Car 클래스는 그저 자동차 객체 인스턴스를 생성하기 위함(단일 책임)
// 등수는 Race 등의 별도 클래스에서 관리하고, 그걸 바탕으로 트랙 그리기(클래스 분리)
public class Car {
    private final int MOVE_STANDARD = 4;
    private final String TRACK = "-";

    private String name;
    private StringBuilder track = new StringBuilder();

    public Car(String carName) {
        isValid(carName);
        this.name = carName;
    }

    // 트랙 관련
    public void updatePosition() {
        if(isMove()) {
            this.track.append(TRACK);
        }
    }

    private boolean isMove() {
        return Randoms.pickNumberInRange(1, 9) >= MOVE_STANDARD;
    }

    // 등수는 이제 트랙의 길이를 통해서(이걸 이용해서 1등 뽑아내기?)
    // Cars를 이용해서 반복문으로 전부 돌린 다음에 음수가 나오면 break(1등 아니니까)
    public int comparePosition (Car other) {
        return this.track.length() - other.track.length();
    }

    public String getName() {
        return name;
    }

    public StringBuilder getTrack() {
        return track;
    }
}
