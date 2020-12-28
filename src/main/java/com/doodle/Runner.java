package com.doodle;

import com.doodle.model.Poll;
import com.doodle.repository.PollRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private PollRepository pollRepository;

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Poll>> typeReference = new TypeReference<List<Poll>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/test.json");
        try {
            List<Poll> polls = mapper.readValue(inputStream,typeReference);
            pollRepository.saveAll(polls);
            System.out.println("Polls saved!");
        } catch (IOException e){
            System.out.println("Unable to save polls: " + e.getMessage());
        }
    }
}
