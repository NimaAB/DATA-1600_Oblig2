package oppgave3;

public interface PhoneAlertModus {

    interface PhoneAlertStatus {
        PhoneAlertStatus endreStatus();
        String henteStatus();
    }

    class Sound implements PhoneAlertStatus {

        @Override
        public PhoneAlertStatus endreStatus() {
            return new Vibrate();
        }

        @Override
        public String henteStatus() {
            return "Sound";
        }
    }

    class Silent implements PhoneAlertStatus {
        @Override
        public PhoneAlertStatus endreStatus() {
            return new Sound();
        }

        @Override
        public String henteStatus() {
            return "Silent";
        }
    }

    class Vibrate implements PhoneAlertStatus {

        @Override
        public PhoneAlertStatus endreStatus() {
            return new Silent();
        }

        @Override
        public String henteStatus() {
            return "Vibrate";
        }
    }
}
