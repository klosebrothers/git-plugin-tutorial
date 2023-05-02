package re.dnl.katas.bowling_kata.frames;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SpareFrameTest {

    @Test
    void shouldThrowErrorWhenSumOfThrowsIsNotTen() {
        assertThrows(IllegalArgumentException.class, () -> new SpareFrame(1, 6));
        assertThrows(IllegalArgumentException.class, () -> new SpareFrame(-1,-5));
        assertThrows(IllegalArgumentException.class, () -> new SpareFrame(5, 6));
    }
}
