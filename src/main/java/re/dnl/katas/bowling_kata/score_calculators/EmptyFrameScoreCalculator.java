package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;

public class EmptyFrameScoreCalculator {
    public static int calculateScore(final EmptyFrame emptyFrame) {
        return emptyFrame.getFirstThrow() + emptyFrame.getSecondThrow();
    }
}
