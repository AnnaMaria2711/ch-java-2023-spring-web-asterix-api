package com.example.chjava2023springwebasterixapi.character;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AsterixController {

    private final AsterixService characterService;


    @GetMapping("/asterix/characters")
    public List<Character> characterList() {
            return characterService.findAll();
    }

    @PostMapping("/asterix/characters")
    public void postCharacter(@RequestBody Character character){
        this.characterService.addCharacter(character);
    }
}