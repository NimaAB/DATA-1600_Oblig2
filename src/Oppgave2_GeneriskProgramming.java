import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave2_GeneriskProgramming {
    /** Oppgave 2.1 */
    public static <T> void printArraylist(ArrayList<T> arrayList){
        for(T element : arrayList){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /** Oppgave 2.2 */
    public static <T> void printArrayReverse(T[] array){
        System.out.println("Original Array: ");
        for(T element:array){
            System.out.print(element + " ");
        }

        System.out.println("\nReversed Array:");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Oppgave 2.1 */
        System.out.println("Oppgave 2.1 - Generisk Metode som printer ut elementene til en arraylist av hvilken som helst type");
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("You", "me", "they", "us"));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.5, 3.87, 6.43, 8.98));
        printArraylist(integerArrayList);
        printArraylist(stringArrayList);
        printArraylist(doubleArrayList);



        /* Oppgave 2.2 */
        System.out.println("Oppgave 2.2 - Generisk Metode som printer ut elementene til et array av hvilken som helst type baklengs");
        String[] stringArray = {"1.trinn", "2.trinn", "3.trinn", "4.trinn"};
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {2.3, 3.54, 4.8, 5.89};
        printArrayReverse(stringArray);
        printArrayReverse(intArray);
        printArrayReverse(doubleArray);
    }
}
