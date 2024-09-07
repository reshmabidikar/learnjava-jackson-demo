package com.learnjava.jackson.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ListsExample {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // List of persons
        List<Person> persons = List.of(new Person("John", 30), new Person("Jane", 25));

        // Convert list to JSON
        String jsonString = objectMapper.writeValueAsString(persons);
        System.out.println(jsonString);

        // Convert JSON back to list
        List<Person> deserializedPersons = objectMapper.readValue(jsonString, new TypeReference<List<Person>>(){});
        deserializedPersons.forEach(person -> System.out.println(person.getName()));
    }
}
