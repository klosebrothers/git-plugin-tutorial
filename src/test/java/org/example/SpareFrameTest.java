package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SpareFrameTest {

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAZero() {
        SpareFrame spareFrame = new SpareFrame(new OpenFrame(0, 0));

        assertThat(spareFrame.getScore()).isEqualTo(10);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowAThree() {
        SpareFrame spareFrame = new SpareFrame(new OpenFrame(3, 0));

        assertThat(spareFrame.getScore()).isEqualTo(13);
    }

    @Test
    void shouldReturnScoreWithFollowingOpenFrameWithFirstThrowANine() {
        SpareFrame spareFrame = new SpareFrame(new OpenFrame(9, 0));

        assertThat(spareFrame.getScore()).isEqualTo(19);
    }

    @Test
    void shouldReturnScoreWithFollowingSpareFrame() {
        SpareFrame spareFrame = new SpareFrame(new SpareFrame(new OpenFrame(3,3)));

        assertThat(spareFrame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithFollowingStrikeFrame() {
        SpareFrame spareFrame = new SpareFrame(new StrikeFrame(new OpenFrame(0,0)));

        assertThat(spareFrame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturnScoreWithFollowingBonusFrame() {
        SpareFrame spareFrame = new SpareFrame(new BonusFrame(1));

        assertThat(spareFrame.getScore()).isEqualTo(11);
    }

    @Test
    void shouldReturnScoreWithFollowingEmptyFrame() {
        SpareFrame spareFrame = new SpareFrame(new EmptyFrame());

        assertThat(spareFrame.getScore()).isEqualTo(10);
    }

    @Test
    void shouldThrowErrorWhenReceivingNullAsNextFrame() {
        assertThrows(IllegalArgumentException.class, () -> new SpareFrame(null));
    }
}
