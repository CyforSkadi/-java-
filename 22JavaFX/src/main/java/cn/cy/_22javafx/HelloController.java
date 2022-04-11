package cn.cy._22javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private Monster monster;
    private Random random;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        int attack = random.nextInt(9) + 2;
        monster.setHealthpoints(monster.getHealthpoints() - attack);
        if (monster.getHealthpoints() >= 0){
            welcomeText.setText(monster.toString());
        } else {
            welcomeText.setText("Monster is dead");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        monster = new Monster(150);
        welcomeText.setText(monster.toString());
    }
}