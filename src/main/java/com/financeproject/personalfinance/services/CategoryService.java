package com.financeproject.personalfinance.services;

import com.financeproject.personalfinance.entities.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    Category getCategory(String categoryName);

    List<Category> getAllCategories();

    Category modifyCategory(Category category);

    Boolean deleteCategory(String Category);

    Category modifyCategoryParent(Category category);

}
