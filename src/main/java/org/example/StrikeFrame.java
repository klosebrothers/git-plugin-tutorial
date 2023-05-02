package org.example;

public class StrikeFrame implements Frame {
    public static final int STATIC_STRIKE_SCORE = 10;
    public static final int STATIC_SPARE_SCORE = 10;
    private final Frame nextFrame;

    public StrikeFrame(final Frame nextFrame) {

//        if (nextFrame == null) {
//            throw new IllegalArgumentException("Next frame of strike may not be null");
//        }

        this.nextFrame = nextFrame;
    }

    @Override
    public int getScore() {

        if (nextFrame instanceof OpenFrame) {
            return STATIC_STRIKE_SCORE + nextFrame.getScore();
        } else if (nextFrame instanceof SpareFrame) {
            return STATIC_STRIKE_SCORE + STATIC_SPARE_SCORE;
        } else if (nextFrame instanceof StrikeFrame) {

            if (((StrikeFrame) nextFrame).nextFrame instanceof OpenFrame) {
                return STATIC_STRIKE_SCORE + STATIC_STRIKE_SCORE
                       + ((OpenFrame) ((StrikeFrame) nextFrame).nextFrame).firstThrow;
            } else if (((StrikeFrame) nextFrame).nextFrame instanceof EmptyFrame) {
                return STATIC_STRIKE_SCORE + STATIC_STRIKE_SCORE;
            } else {
                return 0;
            }
//        } else if (nextFrame instanceof BonusFrame) {
//            return STATIC_SPARE_SCORE + ((BonusFrame) nextFrame).firstThrow;
        } else {
            return 0;
        }
    }
}
