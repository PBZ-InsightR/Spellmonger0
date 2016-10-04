package edu.insightr.spellmonger;

class Player {
    private int lifePoints;
    private int nbCreatures;

    Player() {
        this.lifePoints = 20;
        this.nbCreatures = 0;
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
}
