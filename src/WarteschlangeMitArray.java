import java.util.NoSuchElementException;

public class WarteschlangeMitArray<T> implements Warteschlange<T> {

    T[] speicher;
    int size;

    public WarteschlangeMitArray(int maxGroesse){
        speicher = (T[])new Object[maxGroesse];
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

    public void push(T e) throws IllegalStateException {
        if(size== speicher.length){
            throw new IllegalStateException();
        }
        speicher[size++] = e;
    }

    public T pop() throws NoSuchElementException {

        T tmp = (T)speicher[0];
        for(int i =1; i<size; i++){
            speicher[i-1] = speicher[i];
        }


        return tmp;
    }

    public T front() throws NoSuchElementException {
        return (T)speicher[0];
    }
}
