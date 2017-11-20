package JavaGenericsExercises.p10Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;

        String[] firstTupleArgs = br.readLine().split("\\s+");
        name = String.format("%s %s", firstTupleArgs[0], firstTupleArgs[1]);
        String address = firstTupleArgs[2];
        Tuple<String, String> firstTuple = new Tuple<>(name, address);

        String[] secondTupleArgs = br.readLine().split("\\s+");
        name = secondTupleArgs[0];
        int literOfBeer = Integer.valueOf(secondTupleArgs[1]);
        Tuple<String, Integer> secondTuple = new Tuple<>(name, literOfBeer);

        String[] thirdTupleArgs = br.readLine().split("\\s+");
        int someInteger = Integer.valueOf(thirdTupleArgs[0]);
        double someDouble = Double.valueOf(thirdTupleArgs[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<>(someInteger, someDouble);


        System.out.println(firstTuple.toString());
        System.out.println(secondTuple.toString());
        System.out.println(thirdTuple.toString());
    }
}
