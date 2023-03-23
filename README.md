# java_kafka

<p>
  Precisei dos seguintes comandos para executar o Zookeeper e o Kafka no meu pc Windows:<br>
  <li>start zookeeper<br>
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties</li>

  <li>start kafka<br>
    .\bin\windows\kafka-server-start.bat .\config\server.properties</li>

  <li>create topic<br>
    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic</li>

  <li>create producer<br>
    .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic NOME_TOPICO</li>

  <li>create consumer for listing from-beginning<br>
    .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NOME_TOPICO --from-beginning</li>

  <li>list all topics<br>
    .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092</li>

  <li>describe topics<br>
    .\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe</li>

  <li>alter topic<br>
    .\bin\windows\kafka-topics.bat --alter --bootstrap-server localhost:9092 --topic NOME_TOPICO --partitions 3</li>

  <li>descreve os grupos de consumo<br>
    .\bin\windows\kafka-consumer-groups.bat --all-groups --bootstrap-server localhost:9092 --describe</li>
</p>
