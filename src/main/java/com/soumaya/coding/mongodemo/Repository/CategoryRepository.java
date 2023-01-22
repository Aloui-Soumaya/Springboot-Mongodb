package com.soumaya.coding.mongodemo.Repository;

import com.soumaya.coding.mongodemo.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository
        extends MongoRepository<Category,String> {
}
