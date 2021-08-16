# FizzBuzz
A Java application that reads numbers from Kafka and applies the FizzBuzz algorithm

### compilation

Step 1. Create and start containers

```
cd Kafka && docker-compose up -d
```

Step 2. Find out the host name (CONTAINER ID) and add it to the /etc/hosts file, if there is no file, then create it. Otherwise, when connecting, java.net.UnknownHostException will be received.

```
docker ps
```

Step 3. Launching the application.

```
cd .. && cd FizzBuzz && mvn package && mvn exec:java
```

if errors are received: 
[ERROR] Error executing Maven.
[ERROR] java.lang.IllegalStateException: Unable to load cache item
[ERROR] Caused by: Unable to load cache item
[ERROR] Caused by: Could not initialize class com.google.inject.internal.cglib.core.$MethodWrapper

decision:
@[link1](https://github.com/nroduit/Weasis/issues/201)
@[link2](https://nroduit.github.io/en/getting-started/building-weasis/)
or use Intellij IDEA.


Step 4. Сreating a numbers and topic.

```
cd .. && bash numbersGenerate.sh && cd Kafka && docker-compose exec kafka kafka-topics.sh --create --topic numbers --bootstrap-server localhost:9092 &&
cat ../numbers.txt | docker-compose exec -T kafka kafka-console-producer.sh --topic numbers --bootstrap-server localhost:9092
```
