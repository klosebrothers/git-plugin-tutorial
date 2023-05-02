package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;
import re.dnl.katas.bowling_kata.score_calculators.StrikeFrameScoreCalculator;

public class StrikeFrame extends Frame {
    public static final int STATIC_STRIKE_SCORE = 10;

    public StrikeFrame() {
        this.firstThrow = STATIC_STRIKE_SCORE;
        this.secondThrow = 0;
    }

    @Override
    public FrameScoreCalculator getFrameCalculator() {
        return new StrikeFrameScoreCalculator();
    }
}
