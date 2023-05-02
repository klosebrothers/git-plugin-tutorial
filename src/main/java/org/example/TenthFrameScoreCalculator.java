package org.example;

public class TenthFrameScoreCalculator {
    public static int calculateScore(final TenthFrame tenthFrame) {
        return tenthFrame.firstThrow + tenthFrame.secondThrow + tenthFrame.thirdThrow;
    }
}
