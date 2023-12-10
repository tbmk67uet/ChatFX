module com.example.chatfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.chatfx to javafx.fxml;
    exports com.example.chatfx;
}