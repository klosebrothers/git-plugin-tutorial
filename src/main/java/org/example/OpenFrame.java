package org.example;

public class OpenFrame extends Frame {

    public OpenFrame(final int firstThrow, final int secondThrow) {
        if (firstThrow >= 10 || secondThrow >= 10) {
            throw new IllegalArgumentException("An open frame does not allow throws greater or equal to 10");
        }

        if (firstThrow < 0 || secondThrow < 0) {
            throw new IllegalArgumentException("An open frame does not allow throws lower than 0");
        }

        if (firstThrow + secondThrow == 10) {
            throw new IllegalArgumentException("This frame should actually be a Spare Frame");
        }

        if (firstThrow + secondThrow > 10) {
            throw new IllegalArgumentException("The sum of this frame is bigger than ten. That is unheard of!");
        }

        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    @Override
    public int getScore(final Frame... nextFrames) {
        return firstThrow + secondThrow;
    }
}
