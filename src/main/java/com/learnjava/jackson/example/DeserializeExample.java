package com.learnjava.jackson.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeserializeExample {

    public static void main(String args[]) throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON string
        URI uri = DeserializeExample.class.getClassLoader().getResource("person.json").toURI();
        String jsonString = Files.readString(Path.of(uri));

        // Convert JSON string to Java object
        Person person = objectMapper.readValue(jsonString, Person.class);
        System.out.println(person.getName()); // Output: John
    }
}
