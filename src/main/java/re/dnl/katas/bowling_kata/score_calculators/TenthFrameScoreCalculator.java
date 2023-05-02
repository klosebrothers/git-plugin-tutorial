package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.TenthFrame;

public class TenthFrameScoreCalculator {
    public static int calculateScore(final TenthFrame tenthFrame) {
        return tenthFrame.getFirstThrow() + tenthFrame.getSecondThrow() + tenthFrame.getThirdThrow();
    }
}
