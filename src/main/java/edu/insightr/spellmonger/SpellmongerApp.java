package edu.insightr.spellmonger;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SpellmongerApp {
    private static final Logger logger = Logger.getLogger(SpellmongerApp.class);

    private static final String RITUAL = "Ritual";
    private static final String CREATURE = "Creature";

    Player alice = new Player();
    Player bob = new Player();

    private List<Card> deck = new ArrayList<>(70);

    SpellmongerApp() {
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

    public static void main(String[] args) {
        SpellmongerApp app = new SpellmongerApp();

        boolean onePlayerDead = false;
        Player currentPlayer = app.alice;
        Player opponent = app.bob;
        int currentCardNumber = 0;
        int roundCounter = 1;
        Player winner = null;

        while (!onePlayerDead) {
            logger.info("\n");
            logger.info("***** ROUND " + roundCounter);

            app.drawACard(currentPlayer, opponent, currentCardNumber);

            logger.info(opponent + " has " + opponent.getLifePoints() + " life points and " + currentPlayer + " has " + currentPlayer.getLifePoints() + " life points ");

            if (!currentPlayer.isAlive()) {
                winner = opponent;
                onePlayerDead = true;
            }
            if (!opponent.isAlive()) {
                winner = currentPlayer;
                onePlayerDead = true;
            }

            if (app.alice == currentPlayer) {
                currentPlayer = app.bob;
                opponent = app.alice;
            } else {
                currentPlayer = app.alice;
                opponent = app.bob;
            }
            currentCardNumber++;
            roundCounter++;
        }

        logger.info("\n");
        logger.info("******************************");
        logger.info("THE WINNER IS " + winner + " !!!");
        logger.info("******************************");


    }

    void drawACard(Player currentPlayer, Player opponent, int currentCardNumber) {

        if (CREATURE.equalsIgnoreCase(deck.get(currentCardNumber).getName())) {
            logger.info(currentPlayer + " draw a Creature");
            currentPlayer.addCreatures(1);
            int nbCreatures = currentPlayer.getCreatures();
            if (nbCreatures > 0) {
                dealsDamages(opponent, nbCreatures);
                logger.info("The " + nbCreatures + " creatures of " + currentPlayer + " attack and deal " + nbCreatures + " damages to its opponent");
            }
        }

        if (RITUAL.equalsIgnoreCase(deck.get(currentCardNumber).getName())) {
            logger.info(currentPlayer + " draw a Ritual");
            int nbCreatures = currentPlayer.getCreatures();
            if (nbCreatures > 0) {
                dealsDamages(opponent, nbCreatures + 3);
                logger.info("The " + nbCreatures + " creatures of " + currentPlayer + " attack and deal " + nbCreatures + " damages to its opponent");
            }
            logger.info(currentPlayer + " cast a ritual that deals 3 damages to " + opponent);
        }
    }

    private void dealsDamages(Player player, int damageAmount) {
        player.setLifePoints(player.getLifePoints() - damageAmount);
    }

}
