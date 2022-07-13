import java.util.NoSuchElementException;

public interface Speicher {



    public Boolean isEmpty();

    public int size();

    public int capacity();

    public void push(int e) throws IllegalStateException;

    public int pop() throws NoSuchElementException;



}
