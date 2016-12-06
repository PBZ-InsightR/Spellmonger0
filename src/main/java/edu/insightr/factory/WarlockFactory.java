package edu.insightr.factory;

public class WarlockFactory extends UnitFactory {

    Unit formUnit(UnitType type) {
        Unit unit = null;
        ;
        switch (type) {
            case BASE:
                unit = new WarlockSoldier();
                break;
            case LEVEL_1:
                unit = new WarlockCommander();
                break;
        }
        return unit;
    }
}
