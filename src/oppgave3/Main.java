package oppgave3;

public class Main {

    public static void main(String[] args){
        // Oppgave 3.1
        // State Design Mønstre:
        // en mobil telefon kan ha 3 alert modus (intern tilstand): silent, vibrate og sound
        // her kan vi bruke State Design Mønstre for å endre et objekts oppførsel når intern tilstanden endrer seg

        // Strategy Design Mønstre
        // beskriv problem... den mangler vi


        // Oppgave 3.2 - Implementerer State Design Mønstre
        PhoneAlert phoneAlert = new PhoneAlert();
        phoneAlert.klikk();
        phoneAlert.getStatus();
        phoneAlert.klikk();
        phoneAlert.getStatus();
        phoneAlert.klikk();
        phoneAlert.getStatus();
    }
}
