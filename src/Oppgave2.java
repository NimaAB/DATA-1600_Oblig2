import java.util.ArrayList;

public class Oppgave2 {
    /** Oppgave 2.1 */
    public static <T> void printArraylist(ArrayList<T> arrayList){
        for(T element : arrayList){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /** Oppgave 2.2 */
    public static <T> void printArrayReverse(T[] array){
        System.out.println("Original Array:");
        for(T element:array){
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Reversed Array:");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
