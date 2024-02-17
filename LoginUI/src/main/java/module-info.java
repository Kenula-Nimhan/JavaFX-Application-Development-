module org.example.welcome {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.welcome to javafx.fxml;
    exports org.example.welcome;
}