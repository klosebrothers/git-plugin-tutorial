package re.dnl.katas.bowling_kata;

import java.util.ArrayList;
import java.util.List;

import re.dnl.katas.bowling_kata.frames.Frame;

public class Game {

    List<Frame> frames = new ArrayList<>();

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(final List<Frame> frames) {
        this.frames = frames;
    }
}
