package org.example;

public class TenthFrame extends Frame {

    public final int thirdThrow;

    public TenthFrame(final OpenFrame openFrame) {
        this.firstThrow = openFrame.firstThrow;
        this.secondThrow = openFrame.secondThrow;
        this.thirdThrow = 0;
    }

    public TenthFrame(final EmptyFrame emptyFrame) {
        this.firstThrow = emptyFrame.firstThrow;
        this.secondThrow = emptyFrame.secondThrow;
        this.thirdThrow = 0;
    }

    public TenthFrame(final StrikeFrame strikeFrame, final OpenFrame openFrame) {
        this.firstThrow = strikeFrame.firstThrow;
        this.secondThrow = openFrame.firstThrow;
        this.thirdThrow = openFrame.secondThrow;
    }

    public TenthFrame(final SpareFrame spareFrame, final int firstBonusThrow) {
        this.firstThrow = spareFrame.firstThrow;
        this.secondThrow = spareFrame.secondThrow;
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final SpareFrame spareFrame, final StrikeFrame strikeFrame) {
        this.firstThrow = spareFrame.firstThrow;
        this.secondThrow = spareFrame.secondThrow;
        this.thirdThrow = strikeFrame.firstThrow;
    }

    public TenthFrame(final StrikeFrame strikeFrame, final StrikeFrame secondStrikeFrame, final int firstBonusThrow) {
        this.firstThrow = strikeFrame.firstThrow;
        this.secondThrow = secondStrikeFrame.firstThrow;
        this.thirdThrow = firstBonusThrow;
    }

    public TenthFrame(final StrikeFrame firstStrikeFrame, final StrikeFrame secondStrikeFrame,
                      final StrikeFrame thirdStrikeFrame) {
        this.firstThrow = firstStrikeFrame.firstThrow;
        this.secondThrow = secondStrikeFrame.firstThrow;
        this.thirdThrow = thirdStrikeFrame.firstThrow;
    }

    public TenthFrame(final StrikeFrame strikeFrame, final SpareFrame spareFrame) {
        this.firstThrow = strikeFrame.firstThrow;
        this.secondThrow = spareFrame.firstThrow;
        this.thirdThrow = spareFrame.secondThrow;
    }
}
