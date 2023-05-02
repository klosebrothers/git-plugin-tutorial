package org.example.score_calculators;

import org.example.frames.Frame;
import org.example.frames.SpareFrame;

public class SpareFrameScoreCalculator {

    public static int calculateScore(final SpareFrame frame, final Frame nextFrame) {
        return frame.getFirstThrow() + frame.getSecondThrow() + nextFrame.getFirstThrow();
    }
}
