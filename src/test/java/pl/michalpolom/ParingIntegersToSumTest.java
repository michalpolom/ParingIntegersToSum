package pl.michalpolom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParingIntegersToSumTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldReturnParingIntegersToSum13() {

        ParingIntegersToSum.main(new String[]{"10", "3", "10", "3", "7", "6", "-13", "26", "9999", "13", "0"});

        String output = """
                3 10
                3 10
                6 7
                -13 26
                0 13""";

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

    @Test
    void shouldReturnError() {
        ParingIntegersToSum.main(new String[]{"0", "13", "A", "."});

        String output = "ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)";

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

}