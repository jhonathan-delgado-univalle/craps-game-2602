module com.example.crapsgame2602 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crapsgame2602 to javafx.fxml;
    exports com.example.crapsgame2602;
}