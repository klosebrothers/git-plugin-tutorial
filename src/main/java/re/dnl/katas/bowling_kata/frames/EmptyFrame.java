package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.EmptyFrameScoreCalculator;

public class EmptyFrame extends Frame {

    public EmptyFrame() {
        super(new EmptyFrameScoreCalculator());
        this.firstThrow = 0;
        this.secondThrow = 0;
    }
}
