package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.Person;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class DemoJackson {
    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person();
        person.setName("Jeka");
        person.setAge(39);
        person.setSalary(20);
        String json = mapper.writeValueAsString(person);
        System.out.println("json = " + json);
        Person person1 = mapper.readValue(json, Person.class);
        System.out.println("person1 = " + person1);
    }
}
