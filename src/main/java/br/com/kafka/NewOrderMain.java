package br.com.kafka;

import br.com.kafka.entites.Order;
import br.com.kafka.services.KafkaDispatcher;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (var ordeDispatcher = new KafkaDispatcher<Order>()) {
            try (var emailDispatcher = new KafkaDispatcher<String>()) {

                for (int i = 0; i < 10; i++) {
                    var userId = UUID.randomUUID().toString();
                    var orderId = UUID.randomUUID().toString();
                    var amount = new BigDecimal(Math.random() * 5000 + 1);
                    var order = new Order(userId, orderId, amount);
                    ordeDispatcher.send("ECOMMERCE_NEW_ORDER", userId, order);

                    var email = "Obrigado por comprar conosco! Estamos processando seu pedido!";
                    emailDispatcher.send("ECOMMERCE_SEND_EMAIL", userId, email);

                }
            }
        }
    }
}
