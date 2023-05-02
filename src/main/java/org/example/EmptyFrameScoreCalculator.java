package org.example;

public class EmptyFrameScoreCalculator {
    public static int calculateScore(final EmptyFrame emptyFrame) {
        return emptyFrame.firstThrow + emptyFrame.secondThrow;
    }
}
