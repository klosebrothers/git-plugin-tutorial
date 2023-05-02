package org.example;

public class StrikeFrame extends Frame {
    public static final int STATIC_STRIKE_SCORE = 10;
    public static final int STATIC_SPARE_SCORE = 10;
    private Frame nextFrame;

    public StrikeFrame(final Frame nextFrame) {

//        if (nextFrame == null) {
//            throw new IllegalArgumentException("Next frame of strike may not be null");
//        }

        this.nextFrame = nextFrame;
    }

    public StrikeFrame() {
        this.firstThrow = 10;
        this.secondThrow = 0;
    }

//    @Override
//    public int getScore() {
//
//        return getScore(nextFrame);
//    }

    public int getScore(Frame ... nextFrame) {

        if (nextFrame.length < 1 || nextFrame.length > 2) {
            throw new IllegalArgumentException("Scoring is not possible with no or more than two following frames");
        }

        Frame firstNextFrame = nextFrame[0];
        if (firstNextFrame instanceof OpenFrame) {
            return STATIC_STRIKE_SCORE + firstNextFrame.getScore();
        } else if (firstNextFrame instanceof SpareFrame) {
            return STATIC_STRIKE_SCORE + STATIC_SPARE_SCORE;
        } else if (firstNextFrame instanceof StrikeFrame) {
            return getScoreWhenSecondThrowIsAlsoStrike(nextFrame);
//        } else if (nextFrame instanceof BonusFrame) {
//            return STATIC_SPARE_SCORE + ((BonusFrame) nextFrame).firstThrow;
        } else {
            return 0;
        }
    }

    private int getScoreWhenSecondThrowIsAlsoStrike(final Frame[] nextFrame) {
        Frame secondNextFrame;
        if (nextFrame.length != 2) {
            throw new IllegalArgumentException(
                    "A strike frame needs two frames if the first next frame is a strike frame");
        } else {
            secondNextFrame = nextFrame[1];
        }

        if (secondNextFrame instanceof OpenFrame) {
            return STATIC_STRIKE_SCORE + STATIC_STRIKE_SCORE
                   + secondNextFrame.firstThrow;
        } else if (secondNextFrame instanceof EmptyFrame) {
            return STATIC_STRIKE_SCORE + STATIC_STRIKE_SCORE;
        } else if (secondNextFrame instanceof SpareFrame) {
            return STATIC_STRIKE_SCORE + STATIC_STRIKE_SCORE + secondNextFrame.firstThrow;
        } else {
            return 0;
        }
    }

}
