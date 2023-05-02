package org.example;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    @Test
    void shouldCreateAGame() {
        Game game = new Game();

        assertThat(game).isNotNull();
    }

    @Test
    void shouldHaveAListOfFrames() {
        Game game = new Game();

        List<Frame> frames = game.getFrames();

        assertThat(frames).isEmpty();
    }

}
