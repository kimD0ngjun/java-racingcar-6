package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RaceTrack {

    public String[] carNames; // 자동차 이름 배열
    public int[] carStartLine; // 자동차들 출발선 배열
    public int[] carRank; // 자동차들 전진 횟수 배열 = 업데이트된 이름 길이 = 출발선 인덱스

    public int[] winnerIndex;

    public RaceTrack(String[] carNames) {
        this.carNames = carNames;
        this.carStartLine = new int[carNames.length];
        this.carRank = new int[carNames.length];
    }

    // carNames 배열의 각 요소(자동차 이름)에 " : " 더하기
    public void printCarNames() {
        for (int i = 0; i < carNames.length; i++) {
            carNames[i] = carNames[i] + " : ";
            carStartLine[i] = carNames[i].length();
        }
    }

    // 이제 얘를 이동 회수만큼 반복시켜야 한다
    public void rankCar() {
        for (int i = 0; i < carNames.length; i++) {
            carNames[i] = carNames[i] + countMovement();
            carRank[i] = carNames[i].length() - carStartLine[i];
            System.out.print(carNames[i] + "\n");
        }
        System.out.println();
    }

    // 입력 횟수만큼 먼저 도달한 자동차 나올 때까지 반복
    public void race(int count) {
        int rounds = 0;
        do {
            rankCar();
            rounds++;
        } while (rounds < count);
    }

    // 각 자동차의 전진 여부를 랜덤하게 반환하는 메서드
    private String countMovement() {
        if (moveCar()) {
            return "-";
        }
        return "";
    }

    public boolean moveCar() {
        int drive = Randoms.pickNumberInRange(0,9);
        if (drive >= 4) {
            return true;
        }
        return false;
    }

    // carRank 배열의 요소 중 하나라도 인자 count의 값을 가지는지 확인하는 메소드
//    private boolean checkRaceCompletion(int count) {
//        for (int rank : carRank) {
//            if (rank >= count) {
//                return true; // 레이스 완료 조건 충족
//            }
//        }
//        return false; // 레이스 완료 조건 미충족
//    }

    // REFACTORING
    // 프로그램에서 최소값을 초기 비교값으로 사용할 때 Integer.MIN_VALUE를 활용

    public void selectWinner() {
        int max = Integer.MIN_VALUE;
        int count = 0;

        // 최댓값 찾고, 갯수가 복수인지 확인
        for (int rank : carRank) {
            if (rank > max) {
                max = rank;
                count = 1; // 새로운 최대값 발견시 count를 1로 초기화
            } else if (rank == max) {
                count++; // 같은 최대값을 발견시 count 증가
            }
        }

        // 최댓값과 동일한 값을 가지는 요소의 인덱스를 winnerIndex 배열에 추가
        winnerIndex = new int[count];
        int index = 0;
        for (int i = 0; i < carRank.length; i++) {
            if (carRank[i] == max) {
                winnerIndex[index] = i;
                index++;
            }
        }
    }

    // 우승 관련 메소드
    public void endRace() {
        if (winnerIndex == null) {
            selectWinner();
        }
        StringBuilder win = new StringBuilder();
        for (int i = 0; i < winnerIndex.length; i++) {
            String modifiedName = carNames[winnerIndex[i]].substring(0, carStartLine[winnerIndex[i]] - 3);
            win.append(modifiedName).append(", ");
        }

        if (win.length() >= 2) {
            win.delete(win.length() - 2, win.length());
        }

        String result = win.toString();
        System.out.println("최종 우승자 : " + result);
    }
}
