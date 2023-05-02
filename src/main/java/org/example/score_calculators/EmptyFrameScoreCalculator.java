package org.example.score_calculators;

import org.example.frames.EmptyFrame;

public class EmptyFrameScoreCalculator {
    public static int calculateScore(final EmptyFrame emptyFrame) {
        return emptyFrame.getFirstThrow() + emptyFrame.getSecondThrow();
    }
}
