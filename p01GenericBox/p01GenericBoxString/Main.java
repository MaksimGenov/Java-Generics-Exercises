package JavaGenericsExercises.p01GenericBox.p01GenericBoxString;

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
            Box<String> box = new Box<String>(br.readLine());
            boxes.add(box);
        }

        for (Box box : boxes) {
            System.out.println(box.toString());
        }
    }
}
