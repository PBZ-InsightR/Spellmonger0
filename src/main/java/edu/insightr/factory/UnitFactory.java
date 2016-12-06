package edu.insightr.factory;

public abstract class UnitFactory {

    public Unit createUnit(UnitType type) {
        Unit unit = this.formUnit(type);
        unit.resourceConsumption();
        unit.equip();
        return unit;
    }

    abstract Unit formUnit(UnitType type);
}