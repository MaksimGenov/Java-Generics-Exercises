package JavaGenericsExercises.p10Tuple;

public class Tuple<T, T2> {
    private T item1;
    private T2 item2;

    public Tuple(T item1, T2 item2){
        this.setItem1(item1);
        this.setItem2(item2);
    }

    private void setItem1(T item1) {
        this.item1 = item1;
    }

    private void setItem2(T2 item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.item1, this.item2);
    }
}
