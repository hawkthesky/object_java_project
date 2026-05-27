import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Vet vet = new Dog();
        vet.makeNoise();
        vet.eat();
        vet.giveShot();

        */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> word = new ArrayList<>();

        String input;

        for (int i = 0; i < 5; i++) {

            System.out.print((i + 1) + ") ");
            input = scanner.next();

            word.add(input);
        }

        String temp;

        for (int i = 0; i < word.size(); i++) {

            temp = word.get(i);

            String[] arr = temp.split(",");

            for (int j = 0; j < arr.length; j++) {

                word.add(arr[i]);
                System.out.println(arr[j]);
            }

        }
    }
}
