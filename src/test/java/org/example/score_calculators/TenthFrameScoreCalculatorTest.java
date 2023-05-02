package org.example.score_calculators;

import org.example.OpenFrame;
import org.example.SpareFrame;
import org.example.StrikeFrame;
import org.example.TenthFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TenthFrameScoreCalculatorTest {

    @Test
    void shouldScoreAnOpenFrame() {

        TenthFrame tenthFrame = new TenthFrame(new OpenFrame(1, 1));

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(2);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingAnOpenFrame() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new OpenFrame(2, 3));

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(15);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingAStrikeAndASingleThrow() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new StrikeFrame(), 3);

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(23);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingTwoStrikes() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new StrikeFrame(), new StrikeFrame());

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(30);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingASpare() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new SpareFrame(2, 8));

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(20);
    }

    @Test
    void shouldScoreASpareFrameWithBonusThrow() {

        TenthFrame tenthFrame = new TenthFrame(new SpareFrame(1, 9), 3);

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(13);
    }

    @Test
    void shouldScoreASpareFrameWithBonusThrowBeingAStrike() {

        TenthFrame tenthFrame = new TenthFrame(new SpareFrame(1, 9), new StrikeFrame());

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(20);
    }
}
