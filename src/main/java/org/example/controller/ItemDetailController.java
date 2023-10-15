/**
 * Sample Skeleton for 'ItemDetails.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemDetailController {

    @FXML // fx:id="btnAddStock"
    private JFXButton btnAddStock; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private JFXButton btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private JFXButton btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteSelected"
    private JFXButton btnDeleteSelected; // Value injected by FXMLLoader

    @FXML // fx:id="btnPrintItem"
    private JFXButton btnPrintItem; // Value injected by FXMLLoader

    @FXML
    void btnAddStockOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteSelectedOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
