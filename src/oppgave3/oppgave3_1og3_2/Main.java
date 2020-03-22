package oppgave3.oppgave3_1og3_2;

public class Main {

    public static void main(String[] args){
        // Oppgave 3.1

        // State Design Mønstre:
        // en mobil telefon kan ha 3 alert modus (intern tilstand): silent, vibrate og sound
        // her kan vi bruke State Design Mønstre for å endre objektets oppførsel når intern tilstanden endrer seg.
        // oppførselen(algoritmen) endre seg automatisk avhengig på tilstanden

        // Strategy Design Mønstre:
        // her kan vi tenke på når vi lagrer en fil
        // brukeren velger direkte hvilken oppforsel skal kjøre (lagre som txt eller pdf)
        // ved kjøretid, en bestemt oppførsel(algoritme) kjører avhengig på hva brukeren har valgt


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
