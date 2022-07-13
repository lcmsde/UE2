import java.util.NoSuchElementException;

public interface Speicher<T> {



    public Boolean isEmpty();

    public int size();

    public int capacity();

    public void push(T e) throws IllegalStateException;

    public T pop() throws NoSuchElementException;



}
