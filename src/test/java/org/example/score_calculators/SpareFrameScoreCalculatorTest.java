package org.example.score_calculators;

import org.example.EmptyFrame;
import org.example.OpenFrame;
import org.example.SpareFrame;
import org.example.StrikeFrame;
import org.example.TenthFrame;
import org.example.score_calculators.SpareFrameScoreCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpareFrameScoreCalculatorTest {


    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAZero() {
        OpenFrame openFrame = new OpenFrame(0, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, openFrame)).isEqualTo(10);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAThree() {
        OpenFrame openFrame = new OpenFrame(3, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, openFrame)).isEqualTo(13);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowANine() {
        OpenFrame openFrame = new OpenFrame(9, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, openFrame)).isEqualTo(19);
    }

    @Test
    void shouldReturnScoreWithFollowingSpareFrame() {
        SpareFrame nextFrame = new SpareFrame(1, 9);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, nextFrame)).isEqualTo(11);
    }

    @Test
    void shouldReturnScoreWithFollowingStrikeFrame() {
        StrikeFrame nextFrame = new StrikeFrame();
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, nextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithFollowingTenthFrame() {
        TenthFrame nextFrame = new TenthFrame(new OpenFrame(1, 0));
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, nextFrame)).isEqualTo(11);
    }

    @Test
    void shouldReturnScoreWithFollowingEmptyFrame() {
        EmptyFrame nextFrame = new EmptyFrame();
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(SpareFrameScoreCalculator.calculateScore(spareFrame, nextFrame)).isEqualTo(10);
    }


}
