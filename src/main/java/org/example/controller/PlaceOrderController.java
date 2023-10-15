/**
 * Sample Skeleton for 'PlaceOrder.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderController {

    @FXML // fx:id="btnAddToCart"
    private JFXButton btnAddToCart; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private JFXButton btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private JFXButton btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveOrder"
    private JFXButton btnRemoveOrder; // Value injected by FXMLLoader

    @FXML // fx:id="btnPlaceOrder"
    private JFXButton btnPlaceOrder; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalQtyPrice"
    private Label lblTotalQtyPrice; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalDiscount"
    private Label lblTotalDiscount; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalPrice"
    private Label lblTotalPrice; // Value injected by FXMLLoader

    @FXML // fx:id="lblBalance"
    private Label lblBalance; // Value injected by FXMLLoader

    @FXML // fx:id="txtCash"
    private JFXTextField txtCash; // Value injected by FXMLLoader

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

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
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnRemoveOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
