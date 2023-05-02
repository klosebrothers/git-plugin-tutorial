package org.example;

public class EmptyFrame extends Frame {

    @Override
    public int getScore(final Frame... nextFrames) {
        return 0;
    }
}
