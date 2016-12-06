package edu.insightr.factory;

public class FirstLauncher {
    public static void main(String[] args)    {
        UnitFactory unitFactory = new BarbarianFactory();
        Unit unit = unitFactory.createUnit(UnitType.BASE);
        System.out.println(unit);
    }

}
