package edu.insightr.factory;

import java.util.ArrayList;

public class BarbarianWarrior extends Unit {
    public BarbarianWarrior() {
        this.name = "Kull";
        this.constructionCost = 6;
        this.attack = 2;
        this.dodge = 1;
        this.equipments = new ArrayList();
    }

    public void equip() {
        this.equipments.add("Battle Axe");
        System.out.println("Barbarian Warrior equipment (Battle Axe).");
    }
}