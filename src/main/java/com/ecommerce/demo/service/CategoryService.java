package com.ecommerce.demo.service;

import com.ecommerce.demo.model.Category;
import com.ecommerce.demo.repository.Categoryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

    @Autowired
    private final Categoryrepository categoryrepository;

    public CategoryService(Categoryrepository categoryrepository) {
        this.categoryrepository = categoryrepository;
    }

    public void createCategory(Category category) {
        categoryrepository.save(category);
    }
}
