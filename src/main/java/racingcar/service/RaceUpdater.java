package racingcar.service;

import racingcar.domain.dto.CarDTO;
import racingcar.view.message.OutputMessage;

public class RaceUpdater {
    private RaceUpdater() {
    }

    public static StringBuilder updateTrack(CarDTO carDTO) {
        StringBuilder track = new StringBuilder();
        int position = carDTO.getPosition();

        for (int i = 0; i < position; i++) {
            track.append(OutputMessage.TRACK.getMessage());
        }

        return track;
    }
}
