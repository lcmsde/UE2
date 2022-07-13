import java.util.NoSuchElementException;

public class KellerspeicherMitArray<T> implements Kellerspeicher<T>{
T[] speicher;
int size;

    public KellerspeicherMitArray(int maxGroesse){
        speicher = (T[]) new Object[maxGroesse];
        size=0;
    }


    public T top() throws NoSuchElementException {
        if(size==0){
            throw new NoSuchElementException();
        }else
          return speicher[size-1];
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
    if(size == speicher.length){
        throw new IllegalStateException();
    }else
        speicher[size++]=e;
    }

    public T pop() throws NoSuchElementException {
        if(size == 0){
            throw new NoSuchElementException();
        }else {
            T tmp = this.speicher[size - 1];
            size--;
            return tmp;
        }
    }
}
