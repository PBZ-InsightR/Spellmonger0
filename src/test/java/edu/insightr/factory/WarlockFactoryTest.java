package edu.insightr.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class WarlockFactoryTest {

    @Test
    public void createWarlockSoldier() throws Exception {
        UnitFactory unitFactory = new WarlockFactory();
        Unit unit = unitFactory.createUnit(UnitType.BASE);
        Assert.assertThat(unit, is(not(nullValue())));
        Assert.assertThat(unit, instanceOf(WarlockSoldier.class));
    }

    @Test
    public void createWarlockCommander() throws Exception {
        UnitFactory unitFactory = new WarlockFactory();
        Unit unit = unitFactory.createUnit(UnitType.LEVEL_1);
        Assert.assertThat(unit, is(not(nullValue())));
        Assert.assertThat(unit, instanceOf(WarlockCommander.class));
    }
}
