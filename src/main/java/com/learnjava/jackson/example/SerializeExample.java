package com.learnjava.jackson.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeExample {

    public static void main(String args[]) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Sample object
        Person person = new Person("Jane Doe", 27);

        // Convert object to JSON string
        String jsonString = objectMapper.writeValueAsString(person);
        System.out.println(jsonString);
    }
}
