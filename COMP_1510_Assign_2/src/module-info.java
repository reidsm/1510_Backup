module q5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires transitive javafx.graphics;

    exports q1;
    exports q2;
    exports q3;
    exports q4;
    opens q5 to javafx.fxml;
    exports q5;
}