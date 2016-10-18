package edu.insightr.spellmonger;

import org.apache.log4j.Logger;

public class SpellmongerController {
    private static final Logger LOGGER = Logger.getLogger(SpellmongerController.class);

    SpellmongerModel model;


    public SpellmongerController() {
        model = new SpellmongerModel();
    }

}
