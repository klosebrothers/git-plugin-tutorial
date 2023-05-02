package org.example;

public class BonusFrame extends Frame {

    public BonusFrame(final int firstThrow) {
        this.firstThrow = firstThrow;
    }

    @Override
    public int getScore(final Frame... nextFrames) {
        return 0;
    }
}
