package com.example.chjava2023springwebasterixapi.character;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsterixRepository extends MongoRepository<Character, String> {
List<Character> findAll();
}
