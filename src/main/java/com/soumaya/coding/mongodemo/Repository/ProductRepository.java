package com.soumaya.coding.mongodemo.Repository;

import com.soumaya.coding.mongodemo.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends MongoRepository<Product,String> {
}
