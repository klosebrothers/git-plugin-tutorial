package re.dnl.katas.bowling_kata.score_calculators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static org.assertj.core.api.Assertions.assertThat;

public class TenthFrameScoreCalculatorTest {

    TenthFrameScoreCalculator tenthFrameScoreCalculator;

    @BeforeEach
    void setUp() {
        tenthFrameScoreCalculator = new TenthFrameScoreCalculator();
    }

    @Test
    void shouldScoreAnOpenFrame() {

        TenthFrame tenthFrame = new TenthFrame(new OpenFrame(1, 1));

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(), new EmptyFrame())).isEqualTo(2);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingAnOpenFrame() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new OpenFrame(2, 3));

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(15);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingAStrikeAndASingleThrow() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new StrikeFrame(), 3);

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(23);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingTwoStrikes() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new StrikeFrame(), new StrikeFrame());

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(30);
    }

    @Test
    void shouldScoreAStrikeFrameWithBonusThrowBeingASpare() {

        TenthFrame tenthFrame = new TenthFrame(new StrikeFrame(), new SpareFrame(2, 8));

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(20);
    }

    @Test
    void shouldScoreASpareFrameWithBonusThrow() {

        TenthFrame tenthFrame = new TenthFrame(new SpareFrame(1, 9), 3);

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(13);
    }

    @Test
    void shouldScoreASpareFrameWithBonusThrowBeingAStrike() {

        TenthFrame tenthFrame = new TenthFrame(new SpareFrame(1, 9), new StrikeFrame());

        assertThat(tenthFrameScoreCalculator.calculateScore(tenthFrame, new EmptyFrame(),
                                                            new EmptyFrame())).isEqualTo(20);
    }
}
