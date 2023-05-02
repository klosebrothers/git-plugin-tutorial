package org.example;

public abstract class Frame {
    int firstThrow;
    int secondThrow;

    public abstract int getScore(Frame ... nextFrames);
}
