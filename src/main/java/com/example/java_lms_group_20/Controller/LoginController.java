package com.example.java_lms_group_20.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;
    @FXML private Button loginButton;

    @FXML
    private void initialize() {
        // Optional: any initialization logic
        messageLabel.setText("");
    }

    @FXML
    private void handleLogin() {
        String username = usernameField.getText() == null ? "" : usernameField.getText().trim();
        String password = passwordField.getText() == null ? "" : passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please enter username and password.");
            messageLabel.setStyle("-fx-text-fill: #d9534f;");
            return;
        }

        // Minimal demo success (replace later with DB check)
        messageLabel.setText("Login successful! Welcome, " + username + ".");
        messageLabel.setStyle("-fx-text-fill: #28a745;");
    }
}
