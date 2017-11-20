package JavaGenericsExercises.p07CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> myList = new CustomList<>();

        while (true) {
            String input = br.readLine();

            if ("end".equalsIgnoreCase(input))
                break;

            String[] commandLine = input.split("\\s+");
            String command = commandLine[0];

            switch (command) {
                case "Add":
                    myList.add(commandLine[1]);
                    break;
                case "Remove":
                    myList.remove(Integer.valueOf(commandLine[1]));
                    break;
                case "Contains":
                    System.out.println(myList.contains(commandLine[1]));
                    break;
                case "Swap":
                    myList.swap(Integer.valueOf(commandLine[1]), Integer.valueOf(commandLine[2]));
                    break;
                case "Greater":
                    System.out.println(myList.countGreaterThan(commandLine[1]));
                    break;
                case "Max":
                    System.out.println(myList.getMax());
                    break;
                case "Min":
                    System.out.println(myList.getMin());
                    break;
                case "Print":
                    myList.forEach(System.out::println);
                    break;
                case "Sort":
                    Sorter.sort(myList);
                    break;

            }
        }
    }
}
