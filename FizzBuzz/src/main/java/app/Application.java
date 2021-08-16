package app;

import algorithm.Algorithm;
import algorithm.FizzBuzzAlgorithm;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class Application {

    private enum action {PRINT, FILE};
    action action;

    Application(String str) {
        if (str.equals("print")) {
            action = action.PRINT;
        } else {
            action = action.FILE;
        }
    }

    @KafkaListener(topics = "numbers")
    public void NumbersListener(String numbers) {
        Algorithm algorithm = new FizzBuzzAlgorithm(numbers);

    }

    public static void main()
}
