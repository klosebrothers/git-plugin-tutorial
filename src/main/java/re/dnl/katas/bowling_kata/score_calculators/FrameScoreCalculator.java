package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.Frame;

public interface FrameScoreCalculator {
    int calculateScore(Frame frame, Frame firstNextFrame, Frame secondNextFrame);
}
