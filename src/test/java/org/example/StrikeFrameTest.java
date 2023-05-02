package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StrikeFrameTest {

    @Test
    void shouldReturnScoreWithScoreOfFollowingOpenFrame() {
        OpenFrame nextFrame = new OpenFrame(3, 4);

        assertThat(new StrikeFrame().getScore(nextFrame)).isEqualTo(17);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingSpareFrame() {
        SpareFrame nextFrame = new SpareFrame(1, 9, new OpenFrame(2, 2));

        assertThat(new StrikeFrame().getScore(nextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingOpenFrame() {
        OpenFrame secondNextFrame = new OpenFrame(2, 2);
        StrikeFrame firstNextFrame = new StrikeFrame();

        assertThat(new StrikeFrame().getScore(firstNextFrame, secondNextFrame)).isEqualTo(22);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingEmptyFrame() {
        EmptyFrame secondNextFrame = new EmptyFrame();
        StrikeFrame firstNextFrame = new StrikeFrame();

        assertThat(new StrikeFrame().getScore(firstNextFrame, secondNextFrame)).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingSpareFrame() {
        SpareFrame secondNextFrame = new SpareFrame(1, 9, new EmptyFrame());
        StrikeFrame firstNextFrame = new StrikeFrame();

        assertThat(new StrikeFrame().getScore(firstNextFrame, secondNextFrame)).isEqualTo(21);
    }

    @Test
    void shouldThrowErrorWhenNoOrMoreThanTwoNextFramesArePassed() {
        assertThrows(IllegalArgumentException.class, () -> new StrikeFrame().getScore());
        assertThrows(IllegalArgumentException.class, () -> new StrikeFrame().getScore(new EmptyFrame(), new EmptyFrame(), new EmptyFrame()));
    }
}
