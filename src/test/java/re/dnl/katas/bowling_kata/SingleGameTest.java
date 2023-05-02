package re.dnl.katas.bowling_kata;

import java.util.List;

import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SingleGameTest {

    @Test
    void shouldCreateAGame() {
        assertThat(new SingleGame()).isNotNull();
    }

    @Test
    void shouldHaveAListOfFrames() {

        List<Frame> frames = new SingleGame().getFrames();

        assertThat(frames).isEmpty();
    }

    @Test
    void shouldThrowIfThereAreMoreThanTenFrames() {

        List<Frame> elevenFrames = List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame()
                                          );

        assertThrows(IllegalArgumentException.class, () -> new SingleGame().setFrames(elevenFrames));
    }

    @Test
    void shouldThrowIfThereNoFrames() {

        List<Frame> noFrames = List.of();

        assertThrows(IllegalArgumentException.class, () -> new SingleGame().setFrames(noFrames));
    }

    @Test
    void shouldThrowIfLastFrameIsNotATenthFrame() {

        List<Frame> frameWithLastFrameNotATenthFrame = List.of(
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame(),
                new EmptyFrame()
                                                              );

        assertThrows(IllegalArgumentException.class, () -> new SingleGame().setFrames(frameWithLastFrameNotATenthFrame));
    }
}
