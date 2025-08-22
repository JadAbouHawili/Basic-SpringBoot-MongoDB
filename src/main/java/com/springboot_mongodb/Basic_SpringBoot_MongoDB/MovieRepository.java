package com.springboot_mongodb.Basic_SpringBoot_MongoDB;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MovieRepository extends MongoRepository<Movie, ObjectId> {
    
}
