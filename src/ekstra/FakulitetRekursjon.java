package ekstra;

public class FakulitetRekursjon {

    static int fact(int nummer){
        if(nummer >0){
            return nummer * fact(nummer-1);
        }
        return 1;
    }
}
