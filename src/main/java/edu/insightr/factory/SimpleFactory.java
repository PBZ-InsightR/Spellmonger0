package edu.insightr.factory;


public class SimpleFactory {
    public Unit createUnit(UnitType type) {
        Unit unit = null;
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


