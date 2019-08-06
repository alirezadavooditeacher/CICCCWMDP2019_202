package Problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    @Test
    void isSpecial() {
        Transformer optimus = new Transformer("Optimus Prime", 0, 0, 0, 0, 0,Transformer.Team.Autobot);
        Transformer predaking = new Transformer("Predaking", 0, 0, 0, 0, 0,Transformer.Team.Autobot);
        Transformer dumb = new Transformer("Dumb", 0, 0, 0, 0, 0,Transformer.Team.Autobot);

        assertTrue(optimus.isSpecial());
        assertTrue(predaking.isSpecial());
        assertFalse(dumb.isSpecial());
    }
}