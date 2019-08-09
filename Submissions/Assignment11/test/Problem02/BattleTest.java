package Problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {
    @Test
    void looserIsDestroyed() {
        Transformer jonny = new Transformer(Transformer.Team.Autobot, "Hubcap", 1, 0, 0, 0, 0, 0, 0, 0);
        Transformer boy = new Transformer(Transformer.Team.Deception, "Boy", 0, 0, 0, 0, 0, 0, 0, 0);

        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertTrue(boy.isDestroyed());
    }

    @Test
    void higherRankerWinsTheBattle() {
        Transformer jonny = new Transformer(Transformer.Team.Autobot, "Hubcap", 1, 0, 0, 0, 0, 0, 0, 0);
        Transformer boy = new Transformer(Transformer.Team.Deception, "Boy", 0, 0, 0, 0, 0, 0, 0, 0);

        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertEquals(battle.getWinner(), jonny);
        assertEquals(battle.getLooser(), boy);
    }

    @Test
    void cowardLosesTheBattle() {
        Transformer jonny = new Transformer(Transformer.Team.Autobot, "Hubcap", 0, 10, 10, 10, 0, 0, 0, 0);
        Transformer boy = new Transformer(Transformer.Team.Deception, "Boy", 3, 0, 0, 0, 0, 4, 0, 0);

        assertTrue(jonny.getOverallRating() > boy.getOverallRating());
        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertEquals(battle.getWinner(), boy);
        assertEquals(battle.getLooser(), jonny);
    }

    @Test
    void highSkillWinsTheBattle() {
        Transformer jonny = new Transformer(Transformer.Team.Autobot, "Hubcap", 0, 10, 10, 10, 0, 0, 0, 0);
        Transformer boy = new Transformer(Transformer.Team.Deception, "Boy", 0, 0, 0, 0, 0, 0, 0, 3);

        assertTrue(jonny.getOverallRating() > boy.getOverallRating());
        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertEquals(battle.getWinner(), boy);
        assertEquals(battle.getLooser(), jonny);
    }

    @Test
    void specialOneAlwaysWins() {
        Transformer optimus = new Transformer(Transformer.Team.Autobot, "Optimus Prime", 1, 0, 0, 0, 0, 0, 0, 0);
        Transformer jonny = new Transformer(Transformer.Team.Deception, "Jonny", 10, 0, 0, 0, 0, 0, 0, 0);

        Battle battle = new Battle(jonny, optimus);
        battle.start();
        assertEquals(battle.getWinner(), optimus);
        assertEquals(battle.getLooser(), jonny);
    }

    @Test
    void specialOnesDestroysEachOther() {
        Transformer optimus = new Transformer(Transformer.Team.Autobot, "Optimus Prime", 0, 0, 0, 0, 0, 0, 0, 0);
        Transformer predaking = new Transformer(Transformer.Team.Deception, "Predaking", 0, 0, 0, 0, 0, 0, 0, 0);

        Battle battle = new Battle(predaking, optimus);
        battle.start();
        assertTrue(battle.isTempest());
        assertTrue(optimus.isDestroyed());
        assertTrue(predaking.isDestroyed());
    }
}