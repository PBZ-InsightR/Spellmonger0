package edu.insightr.factory;

public class BarbarianFactory extends UnitFactory {
    Unit formUnit(UnitType type) {
        Unit unit = null;

        switch (type) {
            case BASE:
                unit = new BarbarianWarrior();
                break;
            case LEVEL_1:
                unit = new BarbarianCommander();
                break;
        }
        return unit;
    }
}