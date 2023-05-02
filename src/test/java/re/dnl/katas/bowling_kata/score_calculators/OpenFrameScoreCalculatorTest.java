package re.dnl.katas.bowling_kata.score_calculators;

import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;

import static org.assertj.core.api.Assertions.assertThat;

class OpenFrameScoreCalculatorTest {

    @Test
    void shouldReturnScoreByCountingUpBothThrows() {
        FrameScoreCalculator openFrameScoreCalculator = new OpenFrameScoreCalculator();
        OpenFrame openFrame = new OpenFrame(1, 1);

        assertThat(openFrameScoreCalculator.calculateScore(openFrame, new EmptyFrame(), new EmptyFrame())).isEqualTo(2);
    }
}
