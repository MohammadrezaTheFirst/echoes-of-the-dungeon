module com.echoes.echoesofthedungeon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.echoes.echoesofthedungeon to javafx.fxml;
    exports com.echoes.echoesofthedungeon;
}