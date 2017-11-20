package JavaGenericsExercises.p11Threeuple;

public class Threeuple<T1, T2, T3> {
    private T1 item1;
    private T2 item2;
    private T3 item3;

    public Threeuple(T1 item1, T2 item2, T3 item3) {
        this.setItem1(item1);
        this.setItem2(item2);
        this.setItem3(item3);
    }

    private void setItem1(T1 item1) {
        this.item1 = item1;
    }

    private void setItem2(T2 item2) {
        this.item2 = item2;
    }

    private void setItem3(T3 item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.item1, this.item2, this.item3);
    }
}
