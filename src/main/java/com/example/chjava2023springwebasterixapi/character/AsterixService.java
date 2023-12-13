package com.example.chjava2023springwebasterixapi.character;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

    @Service
    @RequiredArgsConstructor
    public class AsterixService {

        private final AsterixRepository repo;

        public List<Character> findAll() {
            return repo.findAll();
        }
        public Optional<Character> findById(String id) {
            return repo.findById(id);
        }
    public Character addCharacter(Character character) {
        repo.save(character);
        return character;
    }

    }