package edu.insightr.spellmonger;

import org.junit.Assert;
import org.junit.Test;

public class SpellmongerAppTest {
    @Test
    public void drawACard() throws Exception {
        SpellmongerApp app = new SpellmongerApp();

        app.drawACard(app.alice, app.bob, 0);
        Assert.assertEquals(0, app.alice.getCreatures(), 0);

        app.drawACard(app.alice, app.bob, 1);
        Assert.assertEquals(1, app.alice.getCreatures(), 0);
    }
}