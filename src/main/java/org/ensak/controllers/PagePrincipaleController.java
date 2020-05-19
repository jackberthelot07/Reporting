package org.ensak.controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import org.ensak.modele.Division;

import java.net.URL;
import java.util.ResourceBundle;


public class PagePrincipaleController implements Initializable {
    private static final String COLORED_STYLE = "-fx-background-color:#FF8C00";
    private static final String NORMAL_STYLE = "-fx-background-color:#073763";
    public Button goEmployes;
    public Button goProcedures;
    public ComboBox<String> criteres;
    public ComboBox<Division> optionsDivision;
    public TableView tableDonnees;
    public TitledPane graphes;
    public Button download;

    private Button lastButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        onHoverAction(goEmployes);
        onHoverAction(goProcedures);
        lastButton = goEmployes;
        onEmployes();
    }

    public void onEmployes() {
        activeBtn(goEmployes);
    }

    public void onProcedures() {
        activeBtn(goProcedures);
    }

    public void onHoverAction(Button button){
        button.addEventHandler(MouseEvent.MOUSE_ENTERED,
                e -> {
                    if (button != lastButton){
                        button.setStyle(COLORED_STYLE);
                    }
                });

        button.addEventHandler(MouseEvent.MOUSE_EXITED,
                e ->
                {
                    if (button != lastButton){
                        button.setStyle(NORMAL_STYLE);
                    }
                });
    }

    public void onDownload() {

    }

    private void activeBtn(Button button){
        lastButton.setStyle(NORMAL_STYLE);
        button.setStyle(COLORED_STYLE);
        lastButton = button;
    }

}
