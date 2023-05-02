package re.dnl.katas.bowling_kata.score_calculators;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyFrameScoreCalculatorTest {

    @Test
    void shouldReturnZeroAsScore() {

        EmptyFrame emptyFrame = new EmptyFrame();

        assertThat(EmptyFrameScoreCalculator.calculateScore(emptyFrame)).isEqualTo(0);
    }
}
