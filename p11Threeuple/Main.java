package JavaGenericsExercises.p11Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;

        String[] firstThreeupleArgs = br.readLine().split("\\s+");
        name = String.format("%s %s",firstThreeupleArgs[0], firstThreeupleArgs[1]);
        String address = firstThreeupleArgs[2];
        String town = firstThreeupleArgs[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(name, address, town);

        String[] secondThreeupleArgs = br.readLine().split("\\s+");
        name = secondThreeupleArgs[0];
        int litersOfBeer = Integer.valueOf(secondThreeupleArgs[1]);
        boolean drunk = "drunk".equalsIgnoreCase(secondThreeupleArgs[2]);
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(name, litersOfBeer, drunk);

        String[] thirdThreeupleArgs = br.readLine().split("\\s+");
        name = thirdThreeupleArgs[0];
        double accountBalance = Double.valueOf(thirdThreeupleArgs[1]);
        String bankName = thirdThreeupleArgs[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(name, accountBalance, bankName);


        System.out.println(firstThreeuple.toString());
        System.out.println(secondThreeuple.toString());
        System.out.println(thirdThreeuple.toString());
    }
}
