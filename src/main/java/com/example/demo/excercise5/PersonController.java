package com.example.demo.excercise5;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepo personRepo;

    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @RequestMapping("demo/all")
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    @PostMapping("demo/add")
    public List<Person> addItems(@RequestParam String name, String email) {
        Person person = new Person();
        person.setEmail(email);
        person.setFirstName(name);
        personRepo.save(person);
        return personRepo.findAll();
    }
}
