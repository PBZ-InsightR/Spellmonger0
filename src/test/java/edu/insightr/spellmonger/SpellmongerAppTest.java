package edu.insightr.spellmonger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellmongerAppTest {
    @Test
    public void drawACard() throws Exception {
        SpellmongerApp app = new SpellmongerApp();
        app.drawACard("Alice", "Bob", 0);
        Assert.assertEquals(0, app.playersCreature.get("Alice"), 0);
        app.drawACard("Alice", "Bob", 1);
        Assert.assertEquals(1, app.playersCreature.get("Alice"), 1);
    }
}