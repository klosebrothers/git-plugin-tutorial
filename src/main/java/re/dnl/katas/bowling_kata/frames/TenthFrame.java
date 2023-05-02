package re.dnl.katas.bowling_kata.frames;

import re.dnl.katas.bowling_kata.score_calculators.FrameScoreCalculator;
import re.dnl.katas.bowling_kata.score_calculators.TenthFrameScoreCalculator;

public class TenthFrame extends Frame {

    public final int thirdThrow;
    private final static FrameScoreCalculator frameScoreCalculator = new TenthFrameScoreCalculator();

    public int getThirdThrow() {
        return thirdThrow;
    }

    public TenthFrame(final OpenFrame openFrame) {
        super(frameScoreCalculator);
        this.firstThrow = openFrame.getFirstThrow();
        this.secondThrow = openFrame.getSecondThrow();
        this.thirdThrow = 0;
    }

    public TenthFrame(final EmptyFrame emptyFrame) {
        super(frameScoreCalculator);
        this.firstThrow = emptyFrame.getFirstThrow();
        this.secondThrow = emptyFrame.getSecondThrow();
        this.thirdThrow = 0;
    }

    public TenthFrame(final StrikeFrame strikeFrame, final OpenFrame openFrame) {
        super(frameScoreCalculator);
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = openFrame.getFirstThrow();
        this.thirdThrow = openFrame.getSecondThrow();
    }

    public TenthFrame(final SpareFrame spareFrame, final int firstBonusThrow) {
        super(frameScoreCalculator);
        this.firstThrow = spareFrame.getFirstThrow();
        this.secondThrow = spareFrame.getSecondThrow();
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final SpareFrame spareFrame, final StrikeFrame strikeFrame) {
        super(frameScoreCalculator);
        this.firstThrow = spareFrame.getFirstThrow();
        this.secondThrow = spareFrame.getSecondThrow();
        this.thirdThrow = strikeFrame.getFirstThrow();
    }

    public TenthFrame(final StrikeFrame strikeFrame, final StrikeFrame secondStrikeFrame, final int firstBonusThrow) {
        super(frameScoreCalculator);
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = secondStrikeFrame.getFirstThrow();
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final StrikeFrame firstStrikeFrame, final StrikeFrame secondStrikeFrame,
                      final StrikeFrame thirdStrikeFrame) {
        super(frameScoreCalculator);
        this.firstThrow = firstStrikeFrame.getFirstThrow();
        this.secondThrow = secondStrikeFrame.getFirstThrow();
        this.thirdThrow = thirdStrikeFrame.getFirstThrow();
    }

    public TenthFrame(final StrikeFrame strikeFrame, final SpareFrame spareFrame) {
        super(frameScoreCalculator);
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = spareFrame.getFirstThrow();
        this.thirdThrow = spareFrame.getSecondThrow();
    }
}
