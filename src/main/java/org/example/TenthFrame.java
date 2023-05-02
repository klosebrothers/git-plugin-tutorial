package org.example;

public class TenthFrame extends Frame {

    public final int thirdThrow;

    public TenthFrame(final OpenFrame openFrame) {
        this.firstThrow = openFrame.getFirstThrow();
        this.secondThrow = openFrame.getSecondThrow();
        this.thirdThrow = 0;
    }

    public TenthFrame(final EmptyFrame emptyFrame) {
        this.firstThrow = emptyFrame.getFirstThrow();
        this.secondThrow = emptyFrame.getSecondThrow();
        this.thirdThrow = 0;
    }

    public TenthFrame(final StrikeFrame strikeFrame, final OpenFrame openFrame) {
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = openFrame.getFirstThrow();
        this.thirdThrow = openFrame.getSecondThrow();
    }

    public TenthFrame(final SpareFrame spareFrame, final int firstBonusThrow) {
        this.firstThrow = spareFrame.getFirstThrow();
        this.secondThrow = spareFrame.getSecondThrow();
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final SpareFrame spareFrame, final StrikeFrame strikeFrame) {
        this.firstThrow = spareFrame.getFirstThrow();
        this.secondThrow = spareFrame.getSecondThrow();
        this.thirdThrow = strikeFrame.getFirstThrow();
    }

    public TenthFrame(final StrikeFrame strikeFrame, final StrikeFrame secondStrikeFrame, final int firstBonusThrow) {
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = secondStrikeFrame.getFirstThrow();
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final StrikeFrame firstStrikeFrame, final StrikeFrame secondStrikeFrame,
                      final StrikeFrame thirdStrikeFrame) {
        this.firstThrow = firstStrikeFrame.getFirstThrow();
        this.secondThrow = secondStrikeFrame.getFirstThrow();
        this.thirdThrow = thirdStrikeFrame.getFirstThrow();
    }

    public TenthFrame(final StrikeFrame strikeFrame, final SpareFrame spareFrame) {
        this.firstThrow = strikeFrame.getFirstThrow();
        this.secondThrow = spareFrame.getFirstThrow();
        this.thirdThrow = spareFrame.getSecondThrow();
    }
}
