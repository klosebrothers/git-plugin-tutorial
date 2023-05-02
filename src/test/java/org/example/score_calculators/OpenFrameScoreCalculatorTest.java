package org.example.score_calculators;

import org.example.frames.OpenFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OpenFrameScoreCalculatorTest {

    @Test
    void shouldReturnScoreByCountingUpBothThrows() {

        OpenFrame openFrame = new OpenFrame(1, 1);

        assertThat(OpenFrameScoreCalculator.calculateScore(openFrame)).isEqualTo(2);
    }
}
