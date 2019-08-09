package Problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    @Test
    void getOverallRating() {
        Transformer transformer = new Transformer(Transformer.Team.Autobot, "The Fool", 1,2,3,4,0,0,5,0);

        assertEquals(15, transformer.getOverallRating());
    }
}