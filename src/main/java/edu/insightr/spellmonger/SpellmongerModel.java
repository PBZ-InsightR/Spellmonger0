package edu.insightr.spellmonger;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SpellmongerModel {
    public static final Logger LOGGER = Logger.getLogger(SpellmongerModel.class);
    private static final String RITUAL = "Ritual";
    private static final String CREATURE = "Creature";

    Player alice = new Player("Alice");
    Player bob = new Player("Bob");

    private List<Card> deck = new ArrayList<>(70);

    public SpellmongerModel() {
        int ritualMod = 3;
        for (int i = 0; i < 70; i++) {
            if (i % ritualMod == 0) {
                deck.add(new Card(RITUAL));
            }
            if (i % ritualMod != 0) {
                deck.add(new Card(CREATURE));
            }
            if (ritualMod == 3) {
                ritualMod = 2;
            } else {
                ritualMod = 3;
            }
        }
    }

    public void launchGame() {
        boolean onePlayerDead = false;
        Player currentPlayer = this.alice;
        Player opponent = this.bob;
        int currentCardNumber = 0;
        int roundCounter = 1;
        Player winner = null;

        while (!onePlayerDead) {
            LOGGER.info("\n");
            LOGGER.info("***** ROUND " + roundCounter);

            currentPlayer.addEnergy(1);
            this.drawACard(currentPlayer, opponent, currentCardNumber);

            LOGGER.info(opponent + " has " + opponent.getLifePoints() + " life points and " + currentPlayer + " has " + currentPlayer.getLifePoints() + " life points ");

            if (!currentPlayer.isAlive()) {
                winner = opponent;
                onePlayerDead = true;
            }
            if (!opponent.isAlive()) {
                winner = currentPlayer;
                onePlayerDead = true;
            }

            if (this.alice == currentPlayer) {
                currentPlayer = this.bob;
                opponent = this.alice;
            } else {
                currentPlayer = this.alice;
                opponent = this.bob;
            }
            currentCardNumber++;
            roundCounter++;
        }

        LOGGER.info("\n");
        LOGGER.info("******************************");
        LOGGER.info("THE WINNER IS " + winner + " !!!");
        LOGGER.info("******************************");


    }

    void drawACard(Player currentPlayer, Player opponent, int currentCardNumber) {

        if (CREATURE.equalsIgnoreCase(deck.get(currentCardNumber).getName())) {
            LOGGER.info(currentPlayer + " draw a Creature");
            currentPlayer.addCreatures(1);
            int nbCreatures = currentPlayer.getCreatures();
            if (nbCreatures > 0) {
                dealsDamages(opponent, nbCreatures);
                LOGGER.info("The " + nbCreatures + " creatures of " + currentPlayer + " attack and deal " + nbCreatures + " damages to its opponent");
            }
        }

        if (RITUAL.equalsIgnoreCase(deck.get(currentCardNumber).getName())) {
            LOGGER.info(currentPlayer + " draw a Ritual");
            int nbCreatures = currentPlayer.getCreatures();
            if (nbCreatures > 0) {
                dealsDamages(opponent, nbCreatures + 3);
                LOGGER.info("The " + nbCreatures + " creatures of " + currentPlayer + " attack and deal " + nbCreatures + " damages to its opponent");
            }
            LOGGER.info(currentPlayer + " cast a ritual that deals 3 damages to " + opponent);
        }
    }

    private void dealsDamages(Player player, int damageAmount) {
        player.setLifePoints(player.getLifePoints() - damageAmount);
    }
}
