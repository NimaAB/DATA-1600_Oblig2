package oppgave4;


import javafx.scene.control.Alert;

public class ReadyAlerts {
    private Alert error = new Alert(Alert.AlertType.ERROR);

    protected void errorAlert(String title,String header){
        error.setTitle(title);
        error.setHeaderText(header);
        error.showAndWait();
    }
}
