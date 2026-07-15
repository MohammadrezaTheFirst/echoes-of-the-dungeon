package com.echoes.echoesofthedungeon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        Player player = new Player("Knight", 600, 300);

        Rectangle playerSprite = new Rectangle(32, 32);
        playerSprite.setFill(Color.RED);

        playerSprite.setX(player.getX());
        playerSprite.setY(player.getY());

        root.getChildren().add(playerSprite);

        Scene scene = new Scene(root, 1280, 720);

        stage.setTitle("Echoes of the Dungeon");

        stage.setScene(scene);

        stage.show();
    }
}