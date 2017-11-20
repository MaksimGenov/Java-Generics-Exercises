package JavaGenericsExercises.p07CustomList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable> implements Iterable<T>{
    private List<T> myList;

    public CustomList() {
        this.myList = new ArrayList<>();
    }

    public List<T> getMyList() {
        return this.myList;
    }

    public int size(){
        return this.myList.size();
    }

    public T get(int index){
        return this.myList.get(index);
    }

    public void set(int index, T element){
        this.myList.set(index, element);
    }

    public void add(T element) {
        this.myList.add(element);
    }

    public T remove(int index) {
        return this.myList.remove(index);
    }

    public boolean contains(T element) {
        return this.myList.contains(element);
    }

    public void swap(int posOne, int posTwo) {
        T tempElement = this.myList.get(posOne);
        this.myList.set(posOne, myList.get(posTwo));
        this.myList.set(posTwo, tempElement);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T elementInList : this.myList) {
            if (elementInList.compareTo(element) > 0)
                count++;
        }
        return count;
    }

    public T getMax() {
        T firstElement = this.myList.get(0);

        for (T element : this.myList) {
            if (firstElement.compareTo(element) < 0)
                firstElement = element;
        }

        return firstElement;
    }

    public T getMin() {
        T firstElement = this.myList.get(0);

        for (T element : this.myList) {
            if (firstElement.compareTo(element) > 0)
                firstElement = element;
        }

        return firstElement;
    }

    @Override
    public Iterator<T> iterator() {
        return this.myList.iterator();
    }
}
