package JavaGenericsExercises.p01GenericBox.p05GenericCountMethodStrings;

import JavaGenericsExercises.p01GenericBox.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        List<Box<String>> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Box<String> box = new Box<>(br.readLine());
            boxes.add(box);
        }

        String element = br.readLine();

        int count = getCountOfElementsGreaterThanGivenElement(boxes, element);

        System.out.println(count);
    }

    private static <T extends Comparable> int getCountOfElementsGreaterThanGivenElement(List<? extends T> list, T element) {
        int count = 0;
        for (T elementInList : list) {
            if (elementInList.compareTo(element) < 0)
                count++;
        }
        return count;
    }
}