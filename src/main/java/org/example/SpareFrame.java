package org.example;

public class SpareFrame implements Frame {
    public static final int STATIC_SPARE_SCORE = 10;
    public static final int STATIC_STRIKE_SCORE = 10;
    private final Frame nextFrame;

    public SpareFrame(final Frame nextFrame) {

        if (nextFrame == null) {
            throw new IllegalArgumentException("Next frame of spare may not be null");
        }

        this.nextFrame = nextFrame;
    }

    public int getScore() {

        if (nextFrame instanceof OpenFrame) {
            return STATIC_SPARE_SCORE + ((OpenFrame) nextFrame).firstThrow;
        } else if (nextFrame instanceof SpareFrame) {
            return STATIC_SPARE_SCORE + STATIC_SPARE_SCORE;
        } else if (nextFrame instanceof StrikeFrame) {
            return STATIC_SPARE_SCORE + STATIC_STRIKE_SCORE;
        } else if (nextFrame instanceof BonusFrame) {
            return STATIC_SPARE_SCORE + ((BonusFrame) nextFrame).firstThrow;
        } else if (nextFrame instanceof EmptyFrame) {
            return STATIC_SPARE_SCORE + nextFrame.getScore();
        } else {
            return 0;
        }
    }
}
