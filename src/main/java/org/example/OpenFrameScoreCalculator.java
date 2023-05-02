package org.example;

public class OpenFrameScoreCalculator {

    public static int calculateScore(final OpenFrame frame) {
        return frame.firstThrow + frame.secondThrow;
    }
}
