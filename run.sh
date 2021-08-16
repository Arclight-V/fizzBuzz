cd Kafka && docker-compose up -d && cd ..;
docker-compose exec kafka kafka-topics.sh --create --bootstrap-server localhost:9092 --topic numbers;
bash numbersGenerate.sh && cat ~/Desktop/fizzBuzz/numbers.txt | docker-compose exec -T kafka kafka-console-producer.sh --topic numbers --bootstrap-server localhost:9092;
mvn package /Kafka && mvn exec:java /Kafka