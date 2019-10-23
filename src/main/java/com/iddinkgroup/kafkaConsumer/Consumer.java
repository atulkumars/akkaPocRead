package com.iddinkgroup.kafkaConsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iddinkgroup.entity.Agenda;
import com.iddinkgroup.repository.AgendaRepository;

import java.io.IOException;

@Service
public class Consumer {
	
    @Autowired
    private AgendaRepository agendaRepository;

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(ConsumerRecord<String, String>  message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        ObjectMapper om = new ObjectMapper();
        
        if("AgendaCreated".equalsIgnoreCase(message.key()))
        {
        	JsonNode readTree = om.readTree(message.value());
            Agenda ag = new Agenda();
            ag = om.treeToValue(readTree, Agenda.class);

            agendaRepository.save(ag);

        }
 

        
        
        
    }
}
