module ca.bcit.comp1510.a4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires transitive javafx.graphics;

    exports q1;
    exports q2;
    exports q3;
    opens q2 to javafx.fxml;
}