package Problem02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WarTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;
    private PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void resultWithWinner() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(
                new Transformer(Transformer.Team.Deception, "Soundwave", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Bluestreak", 1, 6, 7, 9, 0, 0, 4, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Hubcap", 4, 4, 4, 4, 0, 0, 4, 0)
        );

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Winning team (Deception): Soundwave Survivors from the losing team (Autobot): [Hubcap]\n", outContent.toString());
    }

    @Test
    void resultWithoutWinner() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(
                new Transformer(Transformer.Team.Deception, "Soundwave", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Bluestreak", 8, 9, 2, 6, 0, 0, 7, 0)
        );

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Draw\n", outContent.toString());
    }

    @Test
    void resultWithSuperComboy() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(
                new Transformer(Transformer.Team.Deception, "Optimus Prime", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Bluestreak", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Hubcap", 4, 4, 4, 4, 0, 0, 4, 0)
        );

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Winning team (Deception): Soundwave Survivors from the losing team (Autobot): [Hubcap]\n", outContent.toString());
    }

    @Test
    void resultWithTempest() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(
                new Transformer(Transformer.Team.Deception, "Optimus Prime", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Predaking", 8, 9, 2, 6, 0, 0, 7, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Deception, "Hubcap1", 4, 4, 4, 4, 0, 0, 4, 0)
        );
        transformers.add(
                new Transformer(Transformer.Team.Autobot, "Hubcap2", 4, 4, 4, 4, 0, 0, 4, 0)
        );

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle ALL DESTROYED\n", outContent.toString());
    }
}