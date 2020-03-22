package oppgave3.oppgave3_1og3_2;

public class PhoneAlert implements PhoneAlertModus {
    private PhoneAlertStatus status = new Silent();

    public void klikk(){
        status = status.endreStatus();
    }
    public void getStatus(){
        System.out.println(status.henteStatus());
    }
}
