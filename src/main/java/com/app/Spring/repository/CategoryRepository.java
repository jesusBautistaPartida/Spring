package com.app.Spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.Spring.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
	List<Category> findAll();
}
