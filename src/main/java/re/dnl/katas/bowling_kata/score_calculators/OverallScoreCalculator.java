package re.dnl.katas.bowling_kata.score_calculators;

import java.util.List;

import re.dnl.katas.bowling_kata.Game;
import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

public class OverallScoreCalculator {
    public int calculateScore(final Game game) {
        List<Frame> frames = game.getFrames();

        int overallScore = 0;

        for (int i = 0, framesSize = frames.size(); i < framesSize; i++) {
            final Frame frame = frames.get(i);
            final Frame nextFrame = (i + 1) < framesSize ? frames.get(i + 1) : new EmptyFrame();
            final Frame frameAfterNextFrame = (i + 2) < framesSize ? frames.get(i + 2) : new EmptyFrame();

            if (frame instanceof OpenFrame) {
                overallScore += OpenFrameScoreCalculator.calculateScore((OpenFrame) frame);
            } else if (frame instanceof SpareFrame) {
                overallScore += SpareFrameScoreCalculator.calculateScore((SpareFrame) frame, nextFrame);
            } else if (frame instanceof StrikeFrame) {

                if (nextFrame instanceof StrikeFrame) {
                    overallScore += StrikeFrameScoreCalculator.calculateScore((StrikeFrame) frame, (StrikeFrame) nextFrame,
                                                                              frameAfterNextFrame);
                } else {
                    overallScore += StrikeFrameScoreCalculator.calculateScore((StrikeFrame) frame, nextFrame);
                }
            } else if (frame instanceof TenthFrame) {
                overallScore += TenthFrameScoreCalculator.calculateScore((TenthFrame) frame);
            } else if (frame instanceof EmptyFrame) {
                overallScore += 0;
            }
        }

        return overallScore;
    }
}
