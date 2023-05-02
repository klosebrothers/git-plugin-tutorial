package org.example;

public class BonusFrameScoreCalculator {
    public static int calculateScore(final BonusFrame bonusFrame) {
        return bonusFrame.firstThrow + bonusFrame.secondThrow;
    }
}
