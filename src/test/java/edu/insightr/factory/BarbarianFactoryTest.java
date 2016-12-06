package edu.insightr.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class BarbarianFactoryTest {

    @Test
    public void createBarbarianWarior() throws Exception {
        UnitFactory unitFactory = new BarbarianFactory();
        Unit unit = unitFactory.createUnit(UnitType.BASE);
        Assert.assertThat(unit, is(not(nullValue())));
        Assert.assertThat(unit, instanceOf(BarbarianWarrior.class));
    }

    @Test
    public void createBarbarianCommander() throws Exception {
        UnitFactory unitFactory = new BarbarianFactory();
        Unit unit = unitFactory.createUnit(UnitType.LEVEL_1);
        Assert.assertThat(unit, is(not(nullValue())));
        Assert.assertThat(unit, instanceOf(BarbarianCommander.class));
    }
}