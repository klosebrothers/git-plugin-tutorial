package re.dnl.katas.bowling_kata.score_calculators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static org.assertj.core.api.Assertions.assertThat;

class SpareFrameScoreCalculatorTest {

    SpareFrameScoreCalculator spareFrameScoreCalculator;

    @BeforeEach
    void setUp() {
        spareFrameScoreCalculator = new SpareFrameScoreCalculator();
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAZero() {
        OpenFrame openFrame = new OpenFrame(0, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, openFrame, new EmptyFrame())).isEqualTo(10);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAThree() {
        OpenFrame openFrame = new OpenFrame(3, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, openFrame, new EmptyFrame())).isEqualTo(13);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowANine() {
        OpenFrame openFrame = new OpenFrame(9, 0);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, openFrame, new EmptyFrame())).isEqualTo(19);
    }

    @Test
    void shouldReturnScoreWithFollowingSpareFrame() {
        SpareFrame nextFrame = new SpareFrame(1, 9);
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, nextFrame, new EmptyFrame())).isEqualTo(11);
    }

    @Test
    void shouldReturnScoreWithFollowingStrikeFrame() {
        StrikeFrame nextFrame = new StrikeFrame();
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, nextFrame, new EmptyFrame())).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithFollowingTenthFrame() {
        TenthFrame nextFrame = new TenthFrame(new OpenFrame(1, 0));
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, nextFrame, new EmptyFrame())).isEqualTo(11);
    }

    @Test
    void shouldReturnScoreWithFollowingEmptyFrame() {
        EmptyFrame nextFrame = new EmptyFrame();
        SpareFrame spareFrame = new SpareFrame(1, 9);

        assertThat(spareFrameScoreCalculator.calculateScore(spareFrame, nextFrame, new EmptyFrame())).isEqualTo(10);
    }
}
