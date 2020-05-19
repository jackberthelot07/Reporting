package org.ensak.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class StatBoardController implements Initializable {
    public ComboBox criteres;
    public ComboBox optionsDivision;
    public Button download;
    public TableView tableDonnees;
    public TitledPane graphes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void onDownload(ActionEvent actionEvent) {
    }

}
