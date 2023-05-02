package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TenthFrameTest {

    @Test
    void shouldHaveThreeThrows() {
        TenthFrame tenthFrame = new TenthFrame(new EmptyFrame());

        assertThat(tenthFrame.getFirstThrow()).isEqualTo(0);
        assertThat(tenthFrame.getSecondThrow()).isEqualTo(0);
        assertThat(tenthFrame.thirdThrow).isEqualTo(0);
    }
}
