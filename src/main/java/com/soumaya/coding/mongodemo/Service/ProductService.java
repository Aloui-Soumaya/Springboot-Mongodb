package com.soumaya.coding.mongodemo.Service;

import com.soumaya.coding.mongodemo.Repository.ProductRepository;
import com.soumaya.coding.mongodemo.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public String save(Product product){
        return repository.insert(product).getId();
    }
    public Optional<Product> findById(String productId){
        return repository.findById(productId);
    }
    public List<Product> findAll(){
        return repository.findAll();
    }
    public void delete(String id){
        repository.deleteById(id);
    }
}
