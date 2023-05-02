package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TenthFrameScoreCalculatorTest {

    @Test
    void shouldDoSomething() {

        TenthFrame tenthFrame = new TenthFrame(1, 1);

        assertThat(TenthFrameScoreCalculator.calculateScore(tenthFrame)).isEqualTo(1337);
    }
}
