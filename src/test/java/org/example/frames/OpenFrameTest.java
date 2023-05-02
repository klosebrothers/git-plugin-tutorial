package org.example.frames;

import org.example.frames.OpenFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OpenFrameTest {

    @Test
    void shouldAlwaysHaveTwoThrows() {

        OpenFrame openFrame = new OpenFrame(1, 1);

        assertThat(openFrame.getFirstThrow()).isNotNull();
        assertThat(openFrame.getSecondThrow()).isNotNull();
    }

    @Test
    void shouldReturnErrorIfOneOfTheThrowsIsAbove10() {

        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(10, 0));
        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(0, 10));
    }

    @Test
    void shouldReturnErrorIfFrameIsActuallyASpare() {

        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(9, 1));
        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(3, 7));
    }

    @Test
    void shouldReturnErrorIfSumOfBothThrowsIsGreaterThan9() {

        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(8, 8));
        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(7, 7));
    }

    @Test
    void shouldReturnErrorIfOneOfTheThrowsIsBelow0() {

        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(3, -1));
        assertThrows(IllegalArgumentException.class, () -> new OpenFrame(-1, 2));
    }
}
