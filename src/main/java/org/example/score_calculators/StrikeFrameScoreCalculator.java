package org.example.score_calculators;

import org.example.frames.Frame;
import org.example.frames.StrikeFrame;

public class StrikeFrameScoreCalculator {

    public static int calculateScore(final StrikeFrame frame, final Frame nextFrame) {
        return frame.getFirstThrow() + frame.getSecondThrow() + nextFrame.getFirstThrow() + nextFrame.getSecondThrow();
    }

    public static int calculateScore(final StrikeFrame frame, final StrikeFrame firstNextFrame,
                                     final Frame secondNextFrame) {
        return frame.getFirstThrow() + frame.getSecondThrow() + firstNextFrame.getFirstThrow()
               + firstNextFrame.getSecondThrow() + secondNextFrame.getFirstThrow();
    }
}
