package edu.insightr.spellmonger;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepDefinitions {
    private Map<String, Player> players = new HashMap<>();

    @Given("^\"([^\"]*)\" joins the game$")
    public void joinsTheGame(String playerName) throws Throwable {
        players.put(playerName, new Player(playerName));
    }

    @Then("^player \"([^\"]*)\" has (\\d+) life points and (\\d+) creature$")
    public void playerHasLifePointsAndCreature(String playerName, int lifePoint, int creatureCount) throws Throwable {
        Player player = players.get(playerName);
        assertThat(player.getLifePoints(), is(equalTo(lifePoint)));
        assertThat(player.getCreatures(), is(equalTo(creatureCount)));
    }

}
