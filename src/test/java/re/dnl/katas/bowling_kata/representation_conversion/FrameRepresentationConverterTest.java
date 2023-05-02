package re.dnl.katas.bowling_kata.representation_conversion;

import static org.assertj.core.api.Assertions.assertThat;
import static re.dnl.katas.bowling_kata.representation_conversion.FrameRepresentationConverter.convertToFrame;

import org.junit.jupiter.api.Test;
import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;

class FrameRepresentationConverterTest {

    @Test
    void itShouldConvertTwoGutterThrowsIntoAnEmptyFrame() {
        String input = "--";

        Frame frame = convertToFrame(input);

        assertThat(frame).isEqualTo(new EmptyFrame());

    }

    @Test
    void itShouldConvertOneNormalAndOneGutterThrowIntoAnOpenFrame() {
        String input = "-1";

        Frame frame = convertToFrame(input);

        assertThat(frame).isEqualTo(new OpenFrame(0, 1));
    }

    @Test
    void itShouldConvertOneGutterThrowAndOneNormalThrowIntoAnOpenFrame() {
        String input = "80";

        Frame frame = convertToFrame(input);

        assertThat(frame).isEqualTo(new OpenFrame(8, 0));
    }

    @Test
    void itShouldConvertTwoNormalThrowsIntoAnOpenFrame() {
        String input = "71";

        Frame frame = convertToFrame(input);

        assertThat(frame).isEqualTo(new OpenFrame(7, 1));
    }

    @Test
    void itShouldConvertTwoNormalThrowsIntoASpareFrame() {
        String input = "9/";

        Frame frame = convertToFrame(input);

        assertThat(frame).isEqualTo(new SpareFrame(9, 1));
    }

    @Test
    void itShouldConvertStrikeThrowIntoAStrikeFrame() {
        String input = "X";
        String inputLowercase = "x";

        Frame frame = convertToFrame(input);
        Frame frame2 = convertToFrame(inputLowercase);

        assertThat(frame).isEqualTo(new StrikeFrame());
        assertThat(frame2).isEqualTo(new StrikeFrame());
    }


//    Test-List:
//      Errors for non TenthFrame: /* XX *X X/ X1 64
//      Errors: do not allow any other characters except -/Xx0-9


}
