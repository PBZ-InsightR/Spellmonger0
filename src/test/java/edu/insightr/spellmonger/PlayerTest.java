package edu.insightr.spellmonger;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void addCreature() throws Exception {
        Player player = new Player();
        Assert.assertEquals(0, player.getCreatures(), 0);
        player.addCreatures(2);
        Assert.assertEquals(2, player.getCreatures(), 0);
        player.addCreatures(3);
        Assert.assertEquals(5, player.getCreatures(), 0);
    }
}