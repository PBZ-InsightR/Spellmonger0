package edu.insightr.spellmonger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class SpellmongerApp extends Application {
    private static final Logger LOGGER = Logger.getLogger(SpellmongerApp.class);
    private SpellmongerController controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        controller = new SpellmongerController();

        String fxmlFile = "/fxml/battlefield.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        Parent rootPane = loader.load(getClass().getResourceAsStream(fxmlFile));

        Scene scene = new Scene(rootPane);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Spellmonger");
        stage.setScene(scene);

        stage.show();
    }

}
