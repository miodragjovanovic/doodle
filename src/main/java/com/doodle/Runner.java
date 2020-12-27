package com.doodle;

import com.doodle.model.Poll;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Poll>> typeReference = new TypeReference<List<Poll>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/test.json");
        try {
            List<Poll> polls = mapper.readValue(inputStream,typeReference);
            System.out.println("Polls read!");
        } catch (IOException e){
            System.out.println("Unable to save polls: " + e.getMessage());
        }
    }
}
