package re.dnl.katas.bowling_kata.representation_conversion;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.TenthFrame;

import static java.lang.String.*;

public class TenthFrameRepresentationConverter {

    private TenthFrameRepresentationConverter() {
    }

    public static Frame convertToTenthFrame(final String input) {
        if (input.equalsIgnoreCase("--")) {
            return new TenthFrame(new EmptyFrame());
        }

        char char1 = input.charAt(0) == '-' ? '0' : input.charAt(0);
        char char2 = input.charAt(1) == '-' ? '0' : input.charAt(1);

        int firstThrow = Integer.parseInt(valueOf(char1));
        if (char2 == '/') {
            int secondThrowOfSpare = 10 - firstThrow;
            return new TenthFrame(new SpareFrame(firstThrow, secondThrowOfSpare), 1);
        }
        int secondThrow = Integer.parseInt(valueOf(char2));
        return new TenthFrame(new OpenFrame(firstThrow, secondThrow));

    }
}
