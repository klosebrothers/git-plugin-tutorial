package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrameTest {

    @Test
    void shouldBeAbleToBeAnOpenFrame() {

        Frame frame = new OpenFrame(1, 1);

        assertThat(frame).isInstanceOf(OpenFrame.class);
    }

    @Test
    void shouldBeAbleToBeAStrikeFrame() {

        Frame frame = new StrikeFrame();

        assertThat(frame).isInstanceOf(StrikeFrame.class);
    }

    @Test
    void shouldBeAbleToBeASpareFrame() {

        Frame frame = new SpareFrame(1,9);

        assertThat(frame).isInstanceOf(SpareFrame.class);
    }

    @Test
    void shouldBeAbleToBeABonusFrame() {

        Frame frame = new TenthFrame(1, 0);

        assertThat(frame).isInstanceOf(TenthFrame.class);
    }

    @Test
    void shouldBeAbleToBeAnEmptyFrame() {

        Frame frame = new EmptyFrame();

        assertThat(frame).isInstanceOf(EmptyFrame.class);
    }
}
