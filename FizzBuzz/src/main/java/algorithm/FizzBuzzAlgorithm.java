package algorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FizzBuzzAlgorithm implements Algorithm {

    private enum numberIs {FIZZ, BUZZ, FIZZBUZZ, NUMBER};

    Scanner sc;
    public FizzBuzzAlgorithm(String numbers) {
        sc = new Scanner(numbers);
    }

    private numberIs applyAlgorithm(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return numberIs.FIZZBUZZ;
        } else if (number % 3 == 0) {
            return numberIs.FIZZ;
        } else if (number % 5 == 0) {
            return numberIs.BUZZ;
        } else {
            return numberIs.NUMBER;
        }
    }

    @Override
    public void printAll() {
        int number;
        while(sc.hasNextInt()) {
            number = sc.nextInt();
            numberIs enumnumber = applyAlgorithm(number);
            if (enumnumber == numberIs.FIZZBUZZ) {
                System.out.println("fizzbuzz");
            } else if (enumnumber == numberIs.FIZZ) {
                System.out.println("fizz");
            } else if (enumnumber == numberIs.BUZZ) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }
    }

    @Override
    public void printingAllToFile() throws IOException {
        File file = new File("ResultAlgorithmFizzBuzz.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        int number;
        while(sc.hasNextInt()) {
            number = sc.nextInt();
            numberIs enumnumber = applyAlgorithm(number);
            if (enumnumber == numberIs.FIZZBUZZ) {
                writer.write("fizzbuzz\n");
                writer.flush();
            } else if (enumnumber == numberIs.FIZZ) {
                writer.write("fizz\n");
                writer.flush();
            } else if (enumnumber == numberIs.BUZZ) {
                writer.write("buzz\n");
                writer.flush();
            } else {
                writer.write(number);
                writer.write('\n');
                writer.flush();
            }
        }
        writer.close();
        
    }
}
