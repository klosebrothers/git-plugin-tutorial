package org.example.score_calculators;

import org.example.EmptyFrame;
import org.example.OpenFrame;
import org.example.SpareFrame;
import org.example.StrikeFrame;
import org.example.TenthFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.score_calculators.StrikeFrameScoreCalculator.calculateScore;

class StrikeFrameScoreCalculatorTest {

    @Test
    void shouldReturnScoreWithScoreOfFollowingOpenFrame() {
        OpenFrame nextFrame = new OpenFrame(3, 4);
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, nextFrame)).isEqualTo(17);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingSpareFrame() {
        SpareFrame nextFrame = new SpareFrame(2, 8);
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, nextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingTenthFrame() {
        TenthFrame nextFrame = new TenthFrame(new OpenFrame(2, 3));
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, nextFrame)).isEqualTo(15);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingEmptyFrame() {
        EmptyFrame nextFrame = new EmptyFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, nextFrame)).isEqualTo(10);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingOpenFrame() {
        OpenFrame secondNextFrame = new OpenFrame(2, 2);
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(22);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingEmptyFrame() {
        EmptyFrame secondNextFrame = new EmptyFrame();
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingSpareFrame() {
        SpareFrame secondNextFrame = new SpareFrame(1, 9);
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(21);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingStrikeFrame() {
        StrikeFrame secondNextFrame = new StrikeFrame();
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(30);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingTenthFrame() {
        TenthFrame secondNextFrame = new TenthFrame(new OpenFrame(7, 0));
        StrikeFrame firstNextFrame = new StrikeFrame();
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(calculateScore(strikeFrame, firstNextFrame, secondNextFrame)).isEqualTo(27);
    }
}