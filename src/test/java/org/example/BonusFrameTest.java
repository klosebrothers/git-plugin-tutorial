package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BonusFrameTest {

    @Test
    void shouldHaveAtLeastOneThrow() {
        BonusFrame bonusFrame = new BonusFrame(1);

        assertThat(bonusFrame.firstThrow).isEqualTo(1);
    }
}
