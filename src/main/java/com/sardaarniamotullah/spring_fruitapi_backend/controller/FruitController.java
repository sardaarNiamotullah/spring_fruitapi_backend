package com.sardaarniamotullah.spring_fruitapi_backend.controller;

import com.sardaarniamotullah.spring_fruitapi_backend.model.Fruit;
import com.sardaarniamotullah.spring_fruitapi_backend.repository.FruitRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FruitController {
    @Autowired
    FruitRepositoy fruitRepositoy;
    @GetMapping("/getallfruits")
    public List<Fruit> getallfruits() {
        return fruitRepositoy.findAll();
    }

    @GetMapping("/afruit/{name}")
    public Optional<List<Fruit>> getafruit(@PathVariable String name) {
        return fruitRepositoy.findByName(name);
    }

    @PostMapping("/addfruit")
    public void addfruit(@RequestBody Fruit fruit) {
        fruitRepositoy.save(fruit);
    }
}
