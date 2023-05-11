package com.financeproject.personalfinance.services.impl;

import com.financeproject.personalfinance.entities.Category;
import com.financeproject.personalfinance.exceptions.BadRequestException;
import com.financeproject.personalfinance.exceptions.NotFoundException;
import com.financeproject.personalfinance.repositories.CategoryRepository;
import com.financeproject.personalfinance.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImplementation(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        Optional<Category> categoryNameExists = categoryRepository.findByCategoryName(category.getCategoryName());
        if(categoryNameExists.isPresent()){
            throw new BadRequestException("This category has already been created");
        }
        Category savedCategory = categoryRepository.save(category);
        return savedCategory;
    }

    @Override
    public Optional<Category> getCategory(String categoryName) {
        if(categoryRepository.findByCategoryName(categoryName).isEmpty()){
            throw new NotFoundException("This category does not exist");
        }
        return categoryRepository.findByCategoryName(categoryName);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category modifyCategory(Category category) {
        Category categoryExist = categoryRepository.findByCategoryName(category.getCategoryName())
                .orElseThrow(() -> new NotFoundException("This category does not exist"));
        Category categorySaved = categoryRepository.save(categoryExist);
        return categorySaved;
    }

    @Override
    public Boolean deleteCategory(String categoryName) {
        Category categoryExist = categoryRepository.findByCategoryName(categoryName)
                .orElseThrow(() -> new NotFoundException("This category does not exist"));
        if(categoryExist.getIsDeleted()){
            throw new BadRequestException("This category has already been deleted");
        }
        categoryExist.setIsDeleted(true);
        categoryRepository.save(categoryExist);
        return true;
    }

    @Override
    public Category modifyCategoryParent(Category category) {
        Category categoryExist = categoryRepository.findByCategoryName(category.getCategoryName())
                .orElseThrow(() -> new NotFoundException("This category does not exist"));
        if(categoryExist.getIsDeleted() == true){
            throw new BadRequestException("This category has been deleted");
        }
        Category categorySaved = categoryRepository.save(categoryExist);
        return categorySaved;
    }
}
