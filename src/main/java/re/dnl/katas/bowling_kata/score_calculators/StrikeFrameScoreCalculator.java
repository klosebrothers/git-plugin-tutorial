package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;

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
