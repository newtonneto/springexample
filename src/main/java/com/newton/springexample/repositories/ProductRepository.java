package com.newton.springexample.repositories;

import com.newton.springexample.entities.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//O JpaRepository já implementa todos os metodos básicos por padrão
//    private Map<Long, Product> map = new HashMap<>();
//
//    public void save(Product obj) {
//		map.put(obj.getId(), obj);
//    }
//
//    public Product findById(Long id) {
//		return map.get(id);
//    }
//
//    public List<Product> findAll() {
//		return new ArrayList<Product>(map.values());
//    }
}