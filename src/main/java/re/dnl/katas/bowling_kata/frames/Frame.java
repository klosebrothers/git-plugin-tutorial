package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;

public abstract class Frame {
    int firstThrow;
    int secondThrow;
    final FrameScoreCalculator frameScoreCalculator;

    protected Frame(final FrameScoreCalculator frameScoreCalculator) {
        this.frameScoreCalculator = frameScoreCalculator;
    }

    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }

    public FrameScoreCalculator getScoreCalculator() {
        return this.frameScoreCalculator;
    }
}
