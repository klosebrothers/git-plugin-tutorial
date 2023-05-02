package org.example.score_calculators;

import org.example.frames.OpenFrame;

public class OpenFrameScoreCalculator {

    public static int calculateScore(final OpenFrame frame) {
        return frame.getFirstThrow() + frame.getSecondThrow();
    }
}
