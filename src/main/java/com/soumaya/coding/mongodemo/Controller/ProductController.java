package com.soumaya.coding.mongodemo.Controller;
import com.soumaya.coding.mongodemo.Repository.ProductRepository;
import com.soumaya.coding.mongodemo.Service.ProductService;
import com.soumaya.coding.mongodemo.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/vi/products")
public class ProductController {
    private final ProductService productService;
    private final ProductRepository repository;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Product product){
        return  ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional<Product>> getById(@PathVariable("id")  String id){
        return ResponseEntity.ok(productService.findById(id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") String id){
        productService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
