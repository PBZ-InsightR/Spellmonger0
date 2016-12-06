package edu.insightr.factory;

import java.util.ArrayList;

public class BarbarianCommander extends Unit {
    public BarbarianCommander() {
        this.name = "Conan";
        this.constructionCost = 10;
        this.attack = 3;
        this.dodge = 3;
        this.equipments = new ArrayList();
    }

    public void equip() {
        this.equipments.add("Leather Plate Armor");
        this.equipments.add("Two Handed Battle Axe");
        System.out.println("Barbarian Commander equipment (Two Handed Battle Axe and Leather plate).");
    }
}
