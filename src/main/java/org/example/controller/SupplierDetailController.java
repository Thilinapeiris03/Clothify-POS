/**
 * Sample Skeleton for 'SupplierDetail.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class SupplierDetailController {

//    @FXML
//    private AnchorPane paneSupplierDetail;

    @FXML // fx:id="btnAddSupplier"
    private JFXButton btnAddSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private JFXButton btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteSupplier"
    private JFXButton btnDeleteSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="btnPrintSupplier"
    private JFXButton btnPrintSupplier; // Value injected by FXMLLoader

    @FXML
    void btnAddSupplierOnAction(ActionEvent event) {

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
    void btnDeleteSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
