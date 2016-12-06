package edu.insightr.factory;

import java.util.ArrayList;

public class WarlockCommander extends Unit {

    public WarlockCommander() {
        this.name = "Dark Sorcerer";
        this.constructionCost = 14;
        this.attack = 5;
        this.dodge = 2;
        this.equipments = new ArrayList();
    }

    public void equip() {
        this.equipments.add("Dark Energy Staff");
        this.equipments.add("Elemental Protection Robe");
        System.out.println("Warlock Commander equipment (Dar-Energy Staff and Elemental Protection Robe).");
    }
}