package com.financeproject.personalfinance.services.impl;

import com.financeproject.personalfinance.entities.Category;
import com.financeproject.personalfinance.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {
    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public Category getCategory(String categoryName) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category modifyCategory(Category category) {
        return null;
    }

    @Override
    public Boolean deleteCategory(String Category) {
        return null;
    }

    @Override
    public Category modifyCategoryParent(Category category) {
        return null;
    }
}
