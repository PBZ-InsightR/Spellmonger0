package edu.insightr.factory;

import java.util.ArrayList;

public class WarlockSoldier extends Unit {

    public WarlockSoldier() {
        this.name = "Apprentice Sorcerer";
        this.constructionCost = 5;
        this.attack = 1;
        this.dodge = 2;
        this.equipments = new ArrayList();
    }

    public void equip() {
        this.equipments.add("Magical Wand");
        this.equipments.add("Quilted Armor");
        System.out.println("Warlock Soldier equipment (Magical Wand and Quilted Armor).");
    }
}