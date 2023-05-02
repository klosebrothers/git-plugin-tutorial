package org.example.score_calculators;

import org.example.EmptyFrame;
import org.example.score_calculators.EmptyFrameScoreCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyFrameScoreCalculatorTest {

    @Test
    void shouldReturnZeroAsScore() {

        EmptyFrame emptyFrame = new EmptyFrame();

        assertThat(EmptyFrameScoreCalculator.calculateScore(emptyFrame)).isEqualTo(0);
    }
}
