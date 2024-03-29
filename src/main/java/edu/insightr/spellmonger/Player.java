package edu.insightr.spellmonger;

class Player {
    String name;
    private int lifePoints;
    private int nbCreatures;
    private int energyVault;

    Player(String name) {
        this.lifePoints = 20;
        this.nbCreatures = 0;
        this.energyVault = 0;
        this.name = name;
    } 

    boolean isAlive() {
        return lifePoints >= 0;
    }

    int getLifePoints() {
        return this.lifePoints;
    }

    void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    void addCreatures(int nbCreatures) {
        this.nbCreatures += nbCreatures;
    }

    int getCreatures() {
        return nbCreatures;
    }

    void addEnergy(int energyAmount){
        energyVault += energyAmount;
    }
}
