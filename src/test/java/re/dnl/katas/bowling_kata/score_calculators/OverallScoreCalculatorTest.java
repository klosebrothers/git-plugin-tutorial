package re.dnl.katas.bowling_kata.score_calculators;

import java.util.List;

import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.Game;
import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static org.assertj.core.api.Assertions.assertThat;

class OverallScoreCalculatorTest {

    @Test
    void shouldScoreATotallyEmptyGame() {
        Game game = new Game();
        game.setFrames(List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                              ));
        OverallScoreCalculator overallScoreCalculator = new OverallScoreCalculator();

        int overallScore = overallScoreCalculator.calculateScore(game);

        assertThat(overallScore).isZero();
    }

    @Test
    void shouldScoreOneOpenFrameAndThenOnlyEmptyFrames() {
        assertOverallScoreOfFramesIsEqualTo(1, List.of(
                new OpenFrame(1, 0),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                      ));
    }

    @Test
    void shouldScoreTenOpenFrames() {
        assertOverallScoreOfFramesIsEqualTo(40, List.of(
                new OpenFrame(1, 0),
                new OpenFrame(2, 0),
                new OpenFrame(3, 0),
                new OpenFrame(0, 4),
                new OpenFrame(0, 5),
                new OpenFrame(0, 6),
                new OpenFrame(0, 7),
                new OpenFrame(3, 3),
                new OpenFrame(2, 2),
                new TenthFrame(new OpenFrame(1,1))
                                                       ));
    }

    @Test
    void shouldScoreOneSpareFrameAndThenOneOpenFrame() {
        assertOverallScoreOfFramesIsEqualTo(12, List.of(
                new SpareFrame(1, 9),
                new OpenFrame(1, 0),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreOneSpareFrameAndOneOpenFrameAtTheEnd() {
        assertOverallScoreOfFramesIsEqualTo(12, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new SpareFrame(1, 9),
                new TenthFrame(new OpenFrame(1,0))
                                                       ));
    }

    @Test
    void shouldScoreTwoSpareFrames() {
        assertOverallScoreOfFramesIsEqualTo(24, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new SpareFrame(1, 9),
                new SpareFrame(4, 6),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreOneStrike() {
        assertOverallScoreOfFramesIsEqualTo(10, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new StrikeFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreOneSpareFrameAndOneStrike() {
        assertOverallScoreOfFramesIsEqualTo(30, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new SpareFrame(1, 9),
                new StrikeFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreTwoStrikes() {
        assertOverallScoreOfFramesIsEqualTo(30, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreThreeStrikes() {
        assertOverallScoreOfFramesIsEqualTo(60, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new EmptyFrame(),
                new TenthFrame(new EmptyFrame())
                                                       ));
    }

    @Test
    void shouldScoreTenthFrame() {
        assertOverallScoreOfFramesIsEqualTo(2, List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new TenthFrame(new OpenFrame(1,1))
                                                      ));
    }

    @Test
    void shouldScorePerfectGame() {
        assertOverallScoreOfFramesIsEqualTo(300, List.of(
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new StrikeFrame(),
                new TenthFrame(new StrikeFrame(), new StrikeFrame(), new StrikeFrame())
                                                        ));
    }

    private void assertOverallScoreOfFramesIsEqualTo(final int expected, final List<Frame> frames) {
        Game game = new Game();
        game.setFrames(frames);
        OverallScoreCalculator overallScoreCalculator = new OverallScoreCalculator();

        int overallScore = overallScoreCalculator.calculateScore(game);

        assertThat(overallScore).isEqualTo(expected);
    }
}
