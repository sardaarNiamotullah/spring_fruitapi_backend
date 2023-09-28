package com.sardaarniamotullah.spring_fruitapi_backend.repository;

import com.sardaarniamotullah.spring_fruitapi_backend.model.Fruit;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FruitRepositoy extends MongoRepository<Fruit, ObjectId> {
    Optional<List<Fruit>> findByName(String name);
}
