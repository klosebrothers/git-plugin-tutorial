package re.dnl.katas.bowling_kata.score_calculators;

import java.util.List;

import re.dnl.katas.bowling_kata.SingleGame;
import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;

public class OverallScoreCalculator {
    public int calculateScore(final SingleGame singleGame) {
        List<Frame> frames = singleGame.getFrames();

        int overallScore = 0;

        for (int index = 0, framesSize = frames.size(); index < framesSize; index++) {
            final Frame currentFrame = frames.get(index);
            final Frame nextFrame = getNextOrEmptyFrame(frames, index, framesSize);
            final Frame frameAfterNextFrame = getFrameAfterNextOrEmptyFrame(frames, index, framesSize);

            overallScore += currentFrame.calculateScore(currentFrame, nextFrame, frameAfterNextFrame);
        }

        return overallScore;
    }

    private Frame getNextOrEmptyFrame(final List<Frame> frames, final int index, final int framesSize) {
        int indexOfNextFrame = index + 1;
        boolean nextFrameIsInFramesArray = indexOfNextFrame < framesSize;
        return nextFrameIsInFramesArray ? frames.get(indexOfNextFrame) : new EmptyFrame();
    }

    private Frame getFrameAfterNextOrEmptyFrame(final List<Frame> frames, final int index, final int framesSize) {
        int indexOfFrameAfterNextFrame = index + 2;
        boolean frameAfterNextIsInFramesArray = indexOfFrameAfterNextFrame < framesSize;
        return frameAfterNextIsInFramesArray ? frames.get(indexOfFrameAfterNextFrame) : new EmptyFrame();
    }
}
