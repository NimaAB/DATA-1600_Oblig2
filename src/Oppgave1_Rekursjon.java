import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave1_Rekursjon {


    public static void main(String[] args) {

        //Et helt tall for å prøve metodene nedde:
        int tall = 10;

        //Oppgave 1.1:
        System.out.print("Sum av tallene: " + sum(tall) +"\n");

        //oppgave 1.2:
        //du kan teste for negative eksponenter i tillegg til exp=0;
        System.out.print("Power: "+pow(4,2)+"\n");

        //Oppgave 1.3: en void metode som reverser et array og så kan vi skrive den ut.
        int [] arr1= {25,9,-100,1,5,-1,30};
        baklengsArray(arr1,0,arr1.length-1);
        for(int el:arr1){
            System.out.print(el + " ");
        }

        //Et array for å teste metodene nedde:
        int [] arr = {25,9,-100,1,5,-1,30};

        //Oppgave 1.4:
        System.out.print("\nMinste tall i arrayet er " + minste(arr,0));

        //Oppgave 1.5:
        System.out.print("\nPosisjonen av tallet er lik: " +posisjon(arr,-100,0,arr.length));



    }
    //oppgave 1.1
    static int sum(int x){
        if(x > 0){
            x += sum(x-1);
        }
        if(x<0){
            x += sum(x+1);
        }
        return x;
    }
    //Oppgave 1.2
    static double pow(double base, int exp){
        if(exp == 0){
            return 1;
        }
        if(exp < 0){
            return 1/base * pow(base,++exp);
        }
        return base * pow(base,--exp);
    }
    //Oppgave 1.3
    static void baklengsArray(int [] arr,int start,int end){

        if(start >= end){
            return;
        }
        int element;
        element = arr[start]; //lagrer verdien på start posisjon.
        arr[start] = arr[end]; //setter verdien på start posisjon lik slutt posisjon.
        arr[end]= element;//setter inn den allerede lagret verdie fra start.
        baklengsArray(arr,start+1,end-1);
    }
    //Oppgave 1.4
    static int minste(int[] arr,int posisjon){
        int minsteTall =0;
        if(posisjon <= arr.length-1) {
            minsteTall = arr[posisjon];
            if(minsteTall > minste(arr,posisjon+1)){
                minsteTall = minste(arr,posisjon+1);
            }
        }
        return minsteTall;
    }
    //Oppgave 1.5
    static int posisjon(int [] arr,int tall,int posisjon,int arrayLengde){
        if(arrayLengde == 0){
            return -1;
        }
        if(arr[posisjon] == tall){
            return posisjon;
        }
        return posisjon(arr,tall,posisjon+1,arrayLengde-1);
    }
}
