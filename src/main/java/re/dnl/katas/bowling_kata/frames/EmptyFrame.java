package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.EmptyFrameScoreCalculator;
import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;

public class EmptyFrame extends Frame {
    public EmptyFrame() {
        this.firstThrow = 0;
        this.secondThrow = 0;
    }

    @Override
    public FrameScoreCalculator getFrameCalculator() {
        return new EmptyFrameScoreCalculator();
    }
}
