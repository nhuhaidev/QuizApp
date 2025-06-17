module com.dnh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dnh.quizapp to javafx.fxml;
    exports com.dnh.quizapp;
}
