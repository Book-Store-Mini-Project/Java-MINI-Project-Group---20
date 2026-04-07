package com.example.java_lms_group_20.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label statusLabel;

    private String username;

    @FXML
    private void initialize() {
        if (statusLabel != null) {
            statusLabel.setText("You are successfully logged in.");
        }
    }

    public void setUsername(String username) {
        this.username = username;

        if (welcomeLabel != null) {
            welcomeLabel.setText("Hello, " + username + "!");
        }
    }

    @FXML
    private void handleHome() {
        if (statusLabel != null) {
            statusLabel.setText("Home selected.");
        }
    }

    @FXML
    private void handleProfile() {
        if (statusLabel != null) {
            statusLabel.setText("Profile selected for " + username + ".");
        }
    }

    @FXML
    private void handleCourses() {
        if (statusLabel != null) {
            statusLabel.setText("Courses page is not implemented yet.");
        }
    }

    @FXML
    private void studentregister() {
        if (statusLabel != null) {
            statusLabel.setText("Student Register selected.");
        }

        // Put your student registration logic here
        // Example: open student register page
    }

    @FXML
    private void handleLogout() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login_page.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) welcomeLabel.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login Page");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}