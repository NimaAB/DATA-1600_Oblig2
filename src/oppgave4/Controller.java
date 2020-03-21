package oppgave4;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;
import java.io.File;


public class Controller {

    private ReadyAlerts error = new ReadyAlerts();

    private ReaderThread readerObj;
    private WriterThread writerObj;
    @FXML
    private HTMLEditor editor;
    @FXML
    private Menu menuBtn;

    @FXML
    void Open(ActionEvent event){
        File selectedFile = null;
        Integer versjon = null;
        try {
            versjon = 0;//Integer.parseInt(JOptionPane.showInputDialog("Hvilken versjon vil du laste opp?"));
            selectedFile = new File("D:\\DATA-1600_Oblig2\\src\\oppgave4\\html-v" + versjon + ".txt");
        }catch (NumberFormatException nfe){
            error.errorAlert("Error",nfe.getMessage());
        }
        assert selectedFile !=null;
        if(selectedFile.exists()){
            readerObj = new ReaderThread(selectedFile, editor);
            readerObj.setOnSucceeded(this::readingThreadDone);
            readerObj.setOnFailed(this::readingThreadFaild);
            Thread th = new Thread(readerObj);
            th.setDaemon(true);
            menuBtn.setDisable(false);
            th.start();
        }else{
            error.errorAlert("Error","Tilsvarende versjon: " + versjon + " eksisterer ikke!");
        }
    }
    private void readingThreadDone(WorkerStateEvent e){
        readerObj.call();
        menuBtn.setDisable(false);
    }
    private void readingThreadFaild(WorkerStateEvent event){
        Throwable e = event.getSource().getException();
        error.errorAlert("Thread Faild",e.getMessage());
        menuBtn.setDisable(false);
    }
    @FXML
    void Save(ActionEvent event) {
        File selectedFile = null;
        try {
            int versjon = 0;
                   // Integer.parseInt(JOptionPane.showInputDialog("Hvilken versjon vil du lagre det som?"));
           selectedFile = new File("D:\\DATA-1600_Oblig2\\src\\oppgave4\\html-v"+versjon+".txt");
        }catch (NumberFormatException e){
            error.errorAlert("Error",e.getMessage());
        }
        if(selectedFile != null){
            writerObj = new WriterThread(editor.getHtmlText(), selectedFile);
            writerObj.setOnSucceeded(this::writingThreadDone);
            writerObj.setOnFailed(this::writingThreadFaild);
            Thread thread = new Thread(writerObj);
            thread.setDaemon(true);
            menuBtn.setDisable(true);
            editor.setDisable(true);
            thread.start();
        }else {
            error.errorAlert("Error","Lagring av filen gikk feil, prøv pånytt!");
        }
    }
    private void writingThreadDone(WorkerStateEvent e){
        writerObj.call();
        menuBtn.setDisable(false);
        editor.setDisable(false);
    }
    private void writingThreadFaild(WorkerStateEvent event){
        Throwable e = event.getSource().getException();
        error.errorAlert("Thread Faild",e.getMessage());
        menuBtn.setDisable(false);
        editor.setDisable(false);
    }
    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
    }
}