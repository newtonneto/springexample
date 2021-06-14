package com.newton.springexample.repositories;

import com.newton.springexample.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
//O JpaRepository já implementa todos os metodos básicos por padrão
//    private Map<Long, Category> map = new HashMap<>();
//
//    public void save(Category obj) {
//		map.put(obj.getId(), obj);
//    }
//
//    public Category findById(Long id) {
//		return map.get(id);
//    }
//
//    public List<Category> findAll() {
//		return new ArrayList<Category>(map.values());
//    }
}