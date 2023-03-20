package br.com.kafka.services.utils;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction {

    void consume(ConsumerRecord<String, String> record);

}
