package re.dnl.katas.bowling_kata;

import java.util.ArrayList;
import java.util.List;

import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

public class SingleGame {

    private List<Frame> frames = new ArrayList<>();

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(final List<Frame> frames) {
        validateCorrectFrameSize(frames);
        validateCorrectTenthFrame(frames);

        this.frames = frames;
    }

    private void validateCorrectTenthFrame(final List<Frame> frames) {
        boolean tenthFrameIsNotOfTypeTenthFrame = (frames.size() == 10 && !(frames.get(9) instanceof TenthFrame));
        if (tenthFrameIsNotOfTypeTenthFrame) {
            throw new IllegalArgumentException("The tenth frame of a game must be of type TenthFrame");
        }
    }

    private void validateCorrectFrameSize(final List<Frame> frames) {
        if (frames.size() > 10) {
            throw new IllegalArgumentException("A game can not have more than 10 frames");
        }
        if (frames.size() < 1) {
            throw new IllegalArgumentException("A game can not have less than 1 frame");
        }
    }
}
