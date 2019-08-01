package Problem02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {
    @Test
    void looserIsDestroyed() {
        Transformer jonny = new Transformer("Jonny", 0, 1, 0, 1, 0,Transformer.Team.Autobot);
        Transformer boy = new Transformer("Boy", 0, 0, 1, 0, 0,Transformer.Team.Autobot);

        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertTrue(boy.isDestroyed());
    }

    @Test
    void higherRankerWinsTheBattle() {
        Transformer jonny = new Transformer("Jonny", 0, 1, 0, 1, 0,Transformer.Team.Autobot);
        Transformer boy = new Transformer("Boy", 0, 0, 1, 0, 0,Transformer.Team.Autobot);

        Battle battle = new Battle(jonny, boy);
        battle.start();
        assertEquals(battle.getWinner(), jonny);
        assertEquals(battle.getLooser(), boy);
    }

    @Test
    void specialOneAlwaysWins() {
        Transformer optimus = new Transformer("Optimus Prime", 0, 0, 0, 0, 0,Transformer.Team.Autobot);
        Transformer jonny = new Transformer("Jonny", 0, 1, 0, 1, 0,Transformer.Team.Autobot);

        Battle battle = new Battle(jonny, optimus);
        battle.start();
        System.out.println(optimus.isSpecial());
        System.out.println(battle.getWinner().getName());
        assertEquals(battle.getWinner(), optimus);
        assertEquals(battle.getLooser(), jonny);
    }

    @Test
    void specialOnesDestroysEachOther() {
        Transformer optimus = new Transformer("Optimus Prime", 0, 0, 0, 0, 0,Transformer.Team.Autobot);
        Transformer predaking = new Transformer("Predaking", 0, 0, 0, 0, 0,Transformer.Team.Autobot);

        Battle battle = new Battle(predaking, optimus);
        battle.start();
        assertTrue(optimus.isDestroyed());
        assertTrue(predaking.isDestroyed());
    }

    @Test
    void flaggedAsTempest() {
        Transformer optimus = new Transformer("Optimus Prime", 0, 0, 0, 0, 0,Transformer.Team.Autobot);
        Transformer predaking = new Transformer("Predaking", 0, 0, 0, 0, 0,Transformer.Team.Autobot);

        Battle battle = new Battle(predaking, optimus);
        battle.start();
        assertTrue(battle.isTempest());
    }
}