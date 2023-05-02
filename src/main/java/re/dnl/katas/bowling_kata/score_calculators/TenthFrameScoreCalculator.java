package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

public class TenthFrameScoreCalculator implements FrameScoreCalculator {

    @Override
    public int calculateScore(final Frame tenthFrame, final Frame firstNextFrame, final Frame secondNextFrame) {
        if (tenthFrame instanceof TenthFrame) {
            return tenthFrame.getFirstThrow() + tenthFrame.getSecondThrow() + ((TenthFrame) tenthFrame).getThirdThrow();
        } else {
            throw new IllegalArgumentException("Frame not of type TenthFrame");
        }
    }
}
