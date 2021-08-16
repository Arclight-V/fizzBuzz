cd Kafka && docker-compose up -d && cd .. && cd Kafka;
docker-compose exec kafka kafka-topics.sh --create --bootstrap-server localhost:9092 --topic numbers; cd ..;
bash numbersGenerate.sh && cd Kafka && cat ~/Desktop/fizzBuzz/numbers.txt | docker-compose exec -T kafka kafka-console-producer.sh --topic numbers --bootstrap-server localhost:9092 && cd ..;
mvn package /Kafka && mvn exec:java /Kafka