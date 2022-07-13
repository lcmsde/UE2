import java.util.NoSuchElementException;

public class WarteschlangeMitArray implements Warteschlange {

    int[] speicher;
    int size;

    public WarteschlangeMitArray(int maxGroesse){
        speicher = new int[maxGroesse];
        size=0;
    }

    public Boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return speicher.length;
    }

    public void push(int e) throws IllegalStateException {
        if(size== speicher.length){
            throw new IllegalStateException();
        }
        speicher[size++] = e;
    }

    public int pop() throws NoSuchElementException {

        int tmp = speicher[0];
        for(int i =1; i<size; i++){
            speicher[i-1] = speicher[i];
        }


        return tmp;
    }

    public int front() throws NoSuchElementException {
        return speicher[0];
    }
}
