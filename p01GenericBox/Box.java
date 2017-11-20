package JavaGenericsExercises.p01GenericBox;

public class Box<T extends Comparable<T>> implements Comparable {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.element.getClass().getCanonicalName(), this.element);
    }

    @Override
    public int compareTo(Object o) {
        if (this.element.compareTo((T)o) > 0)
            return -1;
        else if (this.element.compareTo((T)o) < 0)
            return 1;
        else
            return 0;
    }
}