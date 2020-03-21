package oppgave4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Controller {

    private Alert error = new Alert(Alert.AlertType.ERROR);
    @FXML
    private HTMLEditor editor;

    @FXML
    void Open(ActionEvent event) throws IOException {
        File selectedFile = null;
        Integer versjon = null;
        try {
             versjon = Integer.parseInt(JOptionPane.showInputDialog("Hvilken versjon vil du laste opp?"));
            selectedFile = new File("D:\\DATA-1600_Oblig2\\src\\oppgave4\\html-v" + versjon + ".txt");
        }catch (NumberFormatException e){
            error.setTitle("Error");
            error.setHeaderText(e.toString());
            error.showAndWait();
        }
        assert selectedFile !=null;
        if(selectedFile.exists()){
            ReaderThreat readerObj = new ReaderThreat(selectedFile);
            editor.setHtmlText(readerObj.reader(selectedFile));
        }else{
            error.setTitle("Error");
            error.setHeaderText("Tilsvarende versjon: " + versjon + " eksisterer ikke!");
            error.showAndWait();
        }
    }

    @FXML
    void Save(ActionEvent event) {
        File selectedFile = null;
        try {
            int versjon =Integer.parseInt(JOptionPane.showInputDialog("Hvilken versjon vil du lagre det som?"));
           selectedFile = new File("D:\\DATA-1600_Oblig2\\src\\oppgave4\\html-v"+versjon+".txt");
        }catch (NumberFormatException e){
            error.setTitle("Error");
            error.setHeaderText(e.getMessage());
            error.showAndWait();
        }
        if(selectedFile != null){
        WriterThreat writerObj = new WriterThreat(editor.getHtmlText(),selectedFile);
        writerObj.call();
        }else {
            error.setTitle("Error");
            error.setHeaderText("Lagring av filen gikk feil, prøv pånytt!");
            error.showAndWait();
        }
    }
    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
    }
}