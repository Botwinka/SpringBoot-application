package com.spring.tutorial.springDemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CoolDogController {
    private DogRepository dogRepository;

    public CoolDogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @GetMapping("/cool-dogs")
    @CrossOrigin(origins = "http://localhost:4200")
    private Collection<Dog> coolDogs() {
        return  dogRepository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Dog dog){
        return !"York".equalsIgnoreCase(dog.getName());
    }
}
