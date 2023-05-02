package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;

public abstract class Frame {
    int firstThrow;
    int secondThrow;
    final FrameScoreCalculator frameScoreCalculator;

    protected Frame(final FrameScoreCalculator frameScoreCalculator) {
        this.frameScoreCalculator = frameScoreCalculator;
    }

    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }

    public int calculateScore(Frame frame, Frame firstNextFrame, Frame secondNextFrame) {
        return this.frameScoreCalculator.calculateScore(frame, firstNextFrame, secondNextFrame);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Frame frame = (Frame) o;

        if (firstThrow != frame.firstThrow) {
            return false;
        }
        return secondThrow == frame.secondThrow;
    }

    @Override
    public int hashCode() {
        int result = firstThrow;
        result = 31 * result + secondThrow;
        return result;
    }

    @Override
    public String toString() {
        return "First throw: " + firstThrow +"; Second throw: " + secondThrow;
    }
}
