package JavaGenericsExercises.p01GenericBox.p04GenericSwapMethodIntegers;

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

        List<Box<Integer>> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Box<Integer> box = new Box<Integer>(Integer.valueOf(br.readLine()));
            boxes.add(box);
        }

        String[] positions = br.readLine().split("\\s+");
        int pos1 = Integer.valueOf(positions[0]);
        int pos2 = Integer.valueOf(positions[1]);

        swapElementsAtGivenPositions(boxes, pos1, pos2);

        for (Box box : boxes) {
            System.out.println(box.toString());
        }
    }

    private static <T> void swapElementsAtGivenPositions(List<T> list, int pos1, int pos2) {
        T temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
    }
}
