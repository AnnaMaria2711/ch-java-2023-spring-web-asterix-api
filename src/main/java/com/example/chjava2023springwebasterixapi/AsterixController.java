package com.example.chjava2023springwebasterixapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AsterixController {

    private final AsterixRepository asterixRepository;

    public AsterixController(AsterixRepository asterixRepository) {
        this.asterixRepository = asterixRepository;
    }


    @GetMapping("/asterix/characters")
    public List<Character> characterList() {
            return asterixRepository.findAll();
    }

    @PostMapping("/asterix/characters")
    public void postCharacter(@RequestBody Character character){
        this.asterixRepository.insert(character);
    }
}