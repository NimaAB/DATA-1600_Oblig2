package oppgave2;

public class MainForContainerTest {
    public static void main(String[] args) {

        //lager en objekt av Typen:
        Container<String> containerObj = new Container<>();

        //implimenterer add(E element) metoden:
        containerObj.add("JA");
        containerObj.add("VA");
        containerObj.add("1600");

        //implimenterer size() metoden:
        int objLength = containerObj.size();

        //implimenterer get(int index) metoden i løkka:
        for(int i =0; i< objLength; i++){
            String el = containerObj.get(i);
            System.out.print(el + " ");
        }
    }
}
