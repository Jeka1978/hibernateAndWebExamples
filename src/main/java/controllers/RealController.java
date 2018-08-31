package controllers;

import data.Person;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class RealController {


    @GetMapping("/hello/vasya")
    public String hello18(){
        return "Vasya";
    }

    @GetMapping("/hi")
    public String hello3(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/person")
    public boolean validatePerson(@RequestBody Person person) {
        return person.getAge() > 0;
    }


    @GetMapping("/hello/{name}")
    public Person hello2(@PathVariable("name") String name){
        Person person = new Person();
        person.setName(name);
        return person;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
