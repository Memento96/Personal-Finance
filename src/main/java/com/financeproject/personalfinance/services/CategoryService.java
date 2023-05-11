package com.financeproject.personalfinance.services;

import com.financeproject.personalfinance.entities.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Category createCategory(Category category);

    Optional<Category> getCategory(String categoryName);

    List<Category> getAllCategories();

    Category modifyCategory(Category category);

    Boolean deleteCategory(String categoryName);

    Category modifyCategoryParent(Category category);

}
