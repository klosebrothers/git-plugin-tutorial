package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;

public class StrikeFrameScoreCalculator {

    public static int calculateScore(final StrikeFrame frame, final Frame firstNextFrame, final Frame secondNextFrame) {
        if (firstNextFrame instanceof StrikeFrame) {
            return frame.getFirstThrow() + frame.getSecondThrow() + firstNextFrame.getFirstThrow()
                   + firstNextFrame.getSecondThrow() + secondNextFrame.getFirstThrow();
        } else {
            return frame.getFirstThrow() + frame.getSecondThrow() + firstNextFrame.getFirstThrow()
                   + firstNextFrame.getSecondThrow();
        }
    }
}
