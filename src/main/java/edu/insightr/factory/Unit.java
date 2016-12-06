package edu.insightr.factory;

import java.util.ArrayList;

public abstract class Unit {
    protected String name;
    protected int constructionCost;
    protected int attack;
    protected int dodge;
    protected ArrayList equipments;

    public void resourceConsumption() {
        System.out.println("The unit creation consumes " + this.constructionCost + " resources.");
    }

    public abstract void equip();

    public String toString() {
        String str = "Name : " + this.name + "\n";
        str += "Construction Cost : " + this.constructionCost + "\n";
        str += "Attack  : " + this.attack + "\n";
        str += "Dodge : " + this.dodge + "\n";
        str += "Equipments : ";
        for (Object equipment : this.equipments) {
            str += equipment + " ";
        }
        return str;
    }
}


