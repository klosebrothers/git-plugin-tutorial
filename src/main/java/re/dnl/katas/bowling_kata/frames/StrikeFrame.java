package re.dnl.katas.bowling_kata.frames;

public class StrikeFrame extends Frame {
    public static final int STATIC_STRIKE_SCORE = 10;

    public StrikeFrame() {
        this.firstThrow = STATIC_STRIKE_SCORE;
        this.secondThrow = 0;
    }
}
