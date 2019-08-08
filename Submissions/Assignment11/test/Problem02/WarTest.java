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
        transformers.add(new Transformer("Soundwave", 8,9,2,6,7,Transformer.Team.Deception));
        transformers.add(new Transformer("Bluestreak", 1,6,7,9,4,Transformer.Team.Autobot));
        transformers.add(new Transformer("Hubcap", 4,4,4,4,4,Transformer.Team.Autobot));

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Winning team (Deception): Soundwave Survivors from the losing team (Autobot): [Hubcap]\n", outContent.toString());
    }

    @Test
    void resultWithoutWinner() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(new Transformer("Soundwave", 8,9,2,6,7,Transformer.Team.Deception));
        transformers.add(new Transformer("Bluestreak", 8,9,2,6,7,Transformer.Team.Autobot));

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Draw\n", outContent.toString());
    }

    @Test
    void resultWithSuperComboy() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(new Transformer("Optimus Prime", 8,9,2,6,7,Transformer.Team.Deception));
        transformers.add(new Transformer("Bluestreak", 8,9,2,6,7,Transformer.Team.Autobot));
        transformers.add(new Transformer("Hubcap", 4,4,4,4,4,Transformer.Team.Autobot));

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle Winning team (Deception): Soundwave Survivors from the losing team (Autobot): [Hubcap]\n", outContent.toString());
    }

    @Test
    void resultWithTempest() {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(new Transformer("Optimus Prime", 8,9,2,6,7,Transformer.Team.Deception));
        transformers.add(new Transformer("Predaking", 8,9,2,6,7,Transformer.Team.Autobot));
        transformers.add(new Transformer("Hubcap1", 4,4,4,4,4,Transformer.Team.Deception));
        transformers.add(new Transformer("Hubcap2", 4,4,4,4,4,Transformer.Team.Autobot));

        War war = new War(transformers);
        war.start();
        war.printResult();
        assertEquals("1 battle ALL DESTROYED\n", outContent.toString());
    }
}