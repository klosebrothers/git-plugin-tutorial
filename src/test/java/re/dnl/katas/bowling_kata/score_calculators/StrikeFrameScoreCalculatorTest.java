package re.dnl.katas.bowling_kata.score_calculators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static org.assertj.core.api.Assertions.assertThat;

class StrikeFrameScoreCalculatorTest {
    StrikeFrameScoreCalculator strikeFrameScoreCalculator;

    @BeforeEach
    void setUp() {
        strikeFrameScoreCalculator = new StrikeFrameScoreCalculator();
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingOpenFrame() {
        OpenFrame nextFrame = new OpenFrame(3, 4);
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, nextFrame, new EmptyFrame())).isEqualTo(17);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingSpareFrame() {
        SpareFrame nextFrame = new SpareFrame(2, 8);
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, nextFrame, new EmptyFrame())).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingTenthFrame() {
        TenthFrame nextFrame = new TenthFrame(new OpenFrame(2, 3));
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, nextFrame, new EmptyFrame())).isEqualTo(15);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingEmptyFrame() {
        EmptyFrame nextFrame = new EmptyFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, nextFrame, new EmptyFrame())).isEqualTo(10);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingOpenFrame() {
        OpenFrame secondNextFrame = new OpenFrame(2, 2);
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(22);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingEmptyFrame() {
        EmptyFrame secondNextFrame = new EmptyFrame();
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingSpareFrame() {
        SpareFrame secondNextFrame = new SpareFrame(1, 9);
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(21);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingStrikeFrame() {
        StrikeFrame secondNextFrame = new StrikeFrame();
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(30);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingTenthFrame() {
        TenthFrame secondNextFrame = new TenthFrame(new OpenFrame(7, 0));
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrameScoreCalculator.calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(27);
    }
}
