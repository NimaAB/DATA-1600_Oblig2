package Ekstra;

public class HanoisTårn {
    static void hanaaisLosning(int platter, char start,char midt,char slutt){
        if(platter ==  1 || platter == 0){
            System.out.printf("%s --> %s"+ "\n", start,slutt);
            return;
        }

        hanaaisLosning(platter-1,start,slutt,midt);
        System.out.printf("%s --> %s" + "\n",start,slutt);
        hanaaisLosning(platter-1,midt,start,slutt);

    }
}
