package re.dnl.katas.bowling_kata.representation_conversion;

import re.dnl.katas.bowling_kata.frames.EmptyFrame;
import re.dnl.katas.bowling_kata.frames.Frame;
import re.dnl.katas.bowling_kata.frames.OpenFrame;
import re.dnl.katas.bowling_kata.frames.SpareFrame;
import re.dnl.katas.bowling_kata.frames.StrikeFrame;

import static java.lang.String.*;

public class FrameRepresentationConverter {

    private FrameRepresentationConverter() {
    }

    public static Frame convertToFrame(final String input) {

        if (input.equalsIgnoreCase("X")) {
            return new StrikeFrame();
        }

        char firstLetter = input.charAt(0);
        char secondLetter = input.charAt(1);

        if (input.equalsIgnoreCase("--")) {
            return new EmptyFrame();
        } else if (input.contains("/")) {
            int firstThrow = Integer.parseInt(valueOf(firstLetter));
            int secondThrow = 10 - Integer.parseInt(valueOf(firstLetter));

            return new SpareFrame(firstThrow, secondThrow);
        } else {
            int firstThrow = 0;
            int secondThrow = 0;

            if (firstLetter != '-') {
                firstThrow = Integer.parseInt(valueOf(firstLetter));
            }

            if (secondLetter != '-') {
                secondThrow = Integer.parseInt(valueOf(secondLetter));
            }

            return new OpenFrame(firstThrow, secondThrow);
        }
    }
}
