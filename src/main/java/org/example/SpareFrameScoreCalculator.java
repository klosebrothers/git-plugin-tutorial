package org.example;

public class SpareFrameScoreCalculator {

    public static int calculateScore(final SpareFrame frame, final Frame nextFrame) {
        return frame.firstThrow + frame.secondThrow + nextFrame.firstThrow;
    }
}
