package com.newton.springexample.resources;

import com.newton.springexample.entities.Product;
import com.newton.springexample.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> elements = productRepository.findAll();

    return ResponseEntity.ok().body(elements);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product element = productRepository.findById(id).get();
    return ResponseEntity.ok().body(element);
  }
}