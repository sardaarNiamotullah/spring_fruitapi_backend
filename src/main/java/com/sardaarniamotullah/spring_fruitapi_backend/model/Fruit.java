package com.sardaarniamotullah.spring_fruitapi_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document("fruits")
public class Fruit {
    @Id
    private ObjectId _id;
    private int id;
    private String name;
    private String family;
    private String order;
    private String genus;
    private Object nutritions;
    private String comment;
}
