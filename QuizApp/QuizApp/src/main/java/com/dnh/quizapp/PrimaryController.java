package com.dnh.quizapp;

import com.dnh.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleSignIn() throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("QuizApp");
        stage.show();
    }
    public void handleSignUp(){
        MyAlert.getInstance().showMsg("Sign up: Success!!");
    }
    public void handlePractice(){
        MyAlert.getInstance().showMsg("Practice: Coming soon!!");
    }
    public void handleTest(){
        MyAlert.getInstance().showMsg("Test:!!");
    }
}
