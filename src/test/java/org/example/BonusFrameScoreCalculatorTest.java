package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonusFrameScoreCalculatorTest {

    @Test
    void shouldDoSomething() {

        BonusFrame bonusFrame = new BonusFrame(1, 1);

        assertThat(BonusFrameScoreCalculator.calculateScore(bonusFrame)).isEqualTo(1337);
    }
}
