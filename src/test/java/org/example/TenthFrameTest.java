package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TenthFrameTest {

    @Test
    void shouldHaveAtLeastOneThrow() {
        TenthFrame tenthFrame = new TenthFrame(1, 0);

        assertThat(tenthFrame.firstThrow).isEqualTo(1);
    }
}
