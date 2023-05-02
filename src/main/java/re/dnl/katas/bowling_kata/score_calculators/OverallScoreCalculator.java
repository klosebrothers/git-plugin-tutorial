package re.dnl.katas.bowling_kata.score_calculators;

import java.util.List;

import re.dnl.katas.bowling_kata.Game;
import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;

public class OverallScoreCalculator {
    public int calculateScore(final Game game) {
        List<Frame> frames = game.getFrames();

        int overallScore = 0;

        for (int index = 0, framesSize = frames.size(); index < framesSize; index++) {
            final Frame currentFrame = frames.get(index);
            final Frame nextFrame = getNextOrEmptyFrame(frames, index, framesSize);
            final Frame frameAfterNextFrame = getFrameAfterNextOrEmptyFrame(frames, index, framesSize);

            overallScore += currentFrame.getScoreCalculator().calculateScore(currentFrame, nextFrame,
                                                                             frameAfterNextFrame);
        }

        return overallScore;
    }

    private Frame getFrameAfterNextOrEmptyFrame(final List<Frame> frames, final int index, final int framesSize) {
        return (index + 2) < framesSize ? frames.get(index + 2) : new EmptyFrame();
    }

    private Frame getNextOrEmptyFrame(final List<Frame> frames, final int index, final int framesSize) {
        return (index + 1) < framesSize ? frames.get(index + 1) : new EmptyFrame();
    }
}
