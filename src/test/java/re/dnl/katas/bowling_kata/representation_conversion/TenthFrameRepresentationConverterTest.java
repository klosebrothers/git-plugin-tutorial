package re.dnl.katas.bowling_kata.representation_conversion;

import org.junit.jupiter.api.Test;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static org.assertj.core.api.Assertions.assertThat;
import static re.dnl.katas.bowling_kata.representation_conversion.TenthFrameRepresentationConverter.convertToTenthFrame;

class TenthFrameRepresentationConverterTest {

    @Test
    void itShouldConvertTwoGutterThrowsIntoATenthFrame() {
        String input = "--";

        Frame frame = convertToTenthFrame(input);

        assertThat(frame).isEqualTo(new TenthFrame(new EmptyFrame()));
    }

    @Test
    void itShouldConvertOneAndZeroThrowsIntoATenthFrame() {
        String input = "1-";

        Frame frame = convertToTenthFrame(input);

        assertThat(frame).isEqualTo(new TenthFrame(new OpenFrame(1,0)));
    }

    @Test
    void itShouldConvertThrowingOneAndSevenIntoATenthFrameWithOpenFrame() {
        String input = "17";

        Frame frame = convertToTenthFrame(input);

        assertThat(frame).isEqualTo(new TenthFrame(new OpenFrame(1,7)));
    }

    @Test
    void itShouldConvertThrowingSpareAndOneIntoATenthFrameWithSpareFrameAndSingleThrow() {
        String input = "1/1";

        Frame frame = convertToTenthFrame(input);

        assertThat(frame).isEqualTo(new TenthFrame(new SpareFrame(1,9), 1));
    }

    /*
    * Test List
    * x "1-" > new TenthFrame(new OpenFrame(1,0))
    * x "17" > new TenthFrame(new OpenFrame(1,7))
    * x "1/1" > new TenthFrame(new SpareFrame(), 1)
    * - "1/x" > new TenthFrame(new SpareFrame(), new StrikeFrame())
    * - "xx1" > new TenthFrame(new StrikeFrame(), new StrikeFrame(), 1)
    * - "xxx" > new TenthFrame(new StrikeFrame(), new StrikeFrame(), new StrikeFrame())
    * - "x11" > new TenthFrame(new StrikeFrame(), new OpenFrame(1,1))
    * - "x1/" > new TenthFrame(new StrikeFrame(), new SpareFrame(1,1))
    * */
}
