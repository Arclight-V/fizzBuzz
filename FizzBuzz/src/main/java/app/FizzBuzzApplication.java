package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class FizzBuzzApplication {

    @KafkaListener(topics = "numbers")
    public void NumbersListener(String numbers) {

    }
}
