package org.example;

public class StrikeFrameScoreCalculator {

    public static int calculateScore(final StrikeFrame frame, final Frame nextFrame) {
        return frame.firstThrow + frame.secondThrow + nextFrame.firstThrow + nextFrame.secondThrow;
    }
    public static int calculateScore(final StrikeFrame frame, final StrikeFrame firstNextFrame, final Frame secondNextFrame) {
        return frame.firstThrow + frame.secondThrow + firstNextFrame.firstThrow + firstNextFrame.secondThrow + secondNextFrame.firstThrow;
    }
}
