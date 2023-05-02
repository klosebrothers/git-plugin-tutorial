package org.example.score_calculators;

import org.example.TenthFrame;

public class TenthFrameScoreCalculator {
    public static int calculateScore(final TenthFrame tenthFrame) {
        return tenthFrame.getFirstThrow() + tenthFrame.getSecondThrow() + tenthFrame.thirdThrow;
    }
}
