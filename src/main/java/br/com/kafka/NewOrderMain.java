package br.com.kafka;

import br.com.kafka.services.KafkaDispatcher;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try(var dispatcher = new KafkaDispatcher()) {

            for (int i = 0; i < 10; i++) {
                var key = UUID.randomUUID().toString();
                var value = key + ",22,789.50";
                dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);

                var email = "Obrigado por comprar conosco! Estamos processando seu pedido!";
                dispatcher.send("ECOMMERCE_SEND_EMAIL", key, email);

            }
        }
    }
}
