package app;

import algorithm.Algorithm;
import algorithm.FizzBuzzAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class Application {

    @KafkaListener(topics = "numbers")
    public void NumbersListener(String numbers) {
        Algorithm algorithm = new FizzBuzzAlgorithm(numbers);
        algorithm.printAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
