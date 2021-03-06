package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("numbers")
public class NumbersController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

}
