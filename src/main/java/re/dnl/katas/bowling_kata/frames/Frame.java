package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;

public abstract class Frame {
    int firstThrow;
    int secondThrow;

    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }

    public abstract FrameScoreCalculator getFrameCalculator();
}
