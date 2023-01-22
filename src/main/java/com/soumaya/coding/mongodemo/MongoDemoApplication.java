package com.soumaya.coding.mongodemo;

import com.soumaya.coding.mongodemo.Repository.CategoryRepository;
import com.soumaya.coding.mongodemo.Repository.ProductRepository;
import com.soumaya.coding.mongodemo.models.Category;
import com.soumaya.coding.mongodemo.models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}
	//@Bean
	public CommandLineRunner commandLineRunner(
		ProductRepository repository,
		CategoryRepository catReposirty
	){
		return args -> {
			var category1 = Category.builder()
					.name("cat1")
					.description("desc1")
					.build();
			var category2 = Category.builder()
					.name("cat2")
					.description("desc2")
					.build();
			catReposirty.insert(category1);
			catReposirty.insert(category2);
			var product = Product.builder()
					.name("Phone")
					.description("a phone")
					.build();
			//repository.insert(product);
		};
	}
}
