package com.projeto.strconsumer.listeners;

import com.projeto.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {


@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "validMessageContainerFactory")
public void create(String message) {
    log.info("CREATE ::: Receive message {}", message);
}

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
    log.info("HISTORY ::: Receive message {}", message);
    }
    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Receive message {}", message);
    }

}
