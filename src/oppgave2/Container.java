package oppgave2;

public class Container<E> {
    private static final int MAX_SIZE = 10;
    private int elementCounter;
    private Object[] elementListe;
    //konstruktør.
    public Container(){
        this.elementListe = new Object[MAX_SIZE];
        this.elementCounter=0;
    }

    public boolean add(E element){
        if(elementCounter != MAX_SIZE){
           elementListe[elementCounter++]=element;
           return true;
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public E get(int index){
        if(index<0 || index >= elementCounter){
            throw new IndexOutOfBoundsException("Error: antall elementer kan ikke " +
                    "være mindre en 0" +
                    "eller større en " + MAX_SIZE + " !!");
        }
        return (E) elementListe[index];
    }
    public int size(){
        return elementCounter;
    }
}
