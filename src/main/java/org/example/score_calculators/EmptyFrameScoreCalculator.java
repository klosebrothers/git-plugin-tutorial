package org.example.score_calculators;

import org.example.EmptyFrame;

public class EmptyFrameScoreCalculator {
    public static int calculateScore(final EmptyFrame emptyFrame) {
        return emptyFrame.getFirstThrow() + emptyFrame.getSecondThrow();
    }
}
