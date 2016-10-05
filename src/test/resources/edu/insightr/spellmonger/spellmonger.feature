Feature: Player

  Scenario: game initialization
    Given "Alice" joins the game
    Given "Bob" joins the game
    Then player "Alice" has 20 life points and 0 creature
    Then player "Bob" has 20 life points and 0 creature
