package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrikeFrameTest {

    @Test
    void shouldReturnScoreWithScoreOfFollowingOpenFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(new OpenFrame(3, 4));

        assertThat(strikeFrame.getScore()).isEqualTo(17);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingSpareFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(new SpareFrame(1,9,new OpenFrame(2,2)));

        assertThat(strikeFrame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingOpenFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(new StrikeFrame(new OpenFrame(2,2)));

        assertThat(strikeFrame.getScore()).isEqualTo(22);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingEmptyFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(new StrikeFrame(new EmptyFrame()));

        assertThat(strikeFrame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithScoreOfFollowingStrikeFrameAndFollowingSpareFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(new StrikeFrame(new SpareFrame(1,9, new EmptyFrame())));

        assertThat(strikeFrame.getScore()).isEqualTo(21);
    }
}
