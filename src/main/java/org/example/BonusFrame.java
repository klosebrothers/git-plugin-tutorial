package org.example;

public class BonusFrame implements Frame {
    final int firstThrow;

    public BonusFrame(final int firstThrow) {
        this.firstThrow = firstThrow;
    }

    @Override
    public int getScore() {
        return 0;
    }
}
