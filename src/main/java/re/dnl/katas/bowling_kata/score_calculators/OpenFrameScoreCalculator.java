package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.OpenFrame;

public class OpenFrameScoreCalculator {

    public static int calculateScore(final OpenFrame frame) {
        return frame.getFirstThrow() + frame.getSecondThrow();
    }
}
