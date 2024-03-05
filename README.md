# springboot-kafka
Example of using Spring Boot with Kafka queues.

# **Pre-requisite**
* Install Docker
* Install Docker Compose

# Run Kafka
We will create a Kafka cluster setup, called kafka-docker-compose.yml

Let’s spin up the cluster by using the docker-compose command.

`docker-compose -f .\kafka-docker-compose.yml up -d`

**Stop**

`docker-compose -f .\kafka-docker-compose.yml stop`

**The image we use**

http://wurstmeister.github.io/kafka-docker/

**Create new topic**

`docker-compose -f kafka-docker-compose.yml exec kafka kafka-topics.sh --create --topic Topic-2 --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092`

**List the created topic**

`docker-compose -f kafka-docker-compose.yml exec kafka kafka-topics.sh --list --bootstrap-server kafka:9092`

