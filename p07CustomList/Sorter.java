package JavaGenericsExercises.p07CustomList;

public final class Sorter {
    static <T extends Comparable> void sort(CustomList<T> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    //swap elements  
                    list.swap(j - 1, j);
                }
            }
        }
    }
}
