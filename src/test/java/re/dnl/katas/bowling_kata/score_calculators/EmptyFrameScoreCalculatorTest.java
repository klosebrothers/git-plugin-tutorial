package re.dnl.katas.bowling_kata.score_calculators;

import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyFrameScoreCalculatorTest {

    @Test
    void shouldReturnZeroAsScore() {
        EmptyFrameScoreCalculator emptyFrameScoreCalculator = new EmptyFrameScoreCalculator();

        assertThat(emptyFrameScoreCalculator.calculateScore(new EmptyFrame(), new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(0);
    }
}
