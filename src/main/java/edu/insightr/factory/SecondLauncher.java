package edu.insightr.factory;

public class SecondLauncher {
    public static void main(String[] args) {
        UnitFactory barbarianFactory = new BarbarianFactory();
        Unit unit = barbarianFactory.createUnit(UnitType.BASE);
        System.out.println(unit);
    }

}