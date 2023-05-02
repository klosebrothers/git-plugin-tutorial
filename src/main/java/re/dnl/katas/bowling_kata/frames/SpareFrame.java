package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.SpareFrameScoreCalculator;

public class SpareFrame extends Frame {

    public SpareFrame(final int firstThrow, final int secondThrow) {

        super(new SpareFrameScoreCalculator());
        if ((firstThrow + secondThrow != 10)) {
            throw new IllegalArgumentException("The sum of both throws of a spare frame must be 10.");
        }

        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }
}
