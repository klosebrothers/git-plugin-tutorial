package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.Frame;

public class OpenFrameScoreCalculator implements FrameScoreCalculator {

    @Override
    public int calculateScore(final Frame frame, final Frame firstNextFrame, final Frame secondNextFrame) {
        return frame.getFirstThrow() + frame.getSecondThrow();
    }
}
