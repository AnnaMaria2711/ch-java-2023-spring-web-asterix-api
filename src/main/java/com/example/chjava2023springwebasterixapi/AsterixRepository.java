package com.example.chjava2023springwebasterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsterixRepository extends MongoRepository<Character, String> {

}
