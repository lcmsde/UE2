import java.util.NoSuchElementException;

public class KellerspeicherMitArray implements Kellerspeicher{
int[] speicher;
int size;

    public KellerspeicherMitArray(int maxGroesse){
        speicher = new int[maxGroesse];
        size=0;
    }


    public int top() throws NoSuchElementException {
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

    public void push(int e) throws IllegalStateException {
    if(size == speicher.length){
        throw new IllegalStateException();
    }else
        speicher[size++]=e;
    }

    public int pop() throws NoSuchElementException {
        int tmp;
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
        return speicher[--size];
        }

    }
}
