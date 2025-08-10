package com.tamarwell.finance_manager.service;

import com.tamarwell.finance_manager.entity.Subcategory;
import com.tamarwell.finance_manager.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubcategoryService {

    @Autowired
    private SubcategoryRepository repository;

    public Optional<Subcategory> findByNameAndCategoryId(String subcategoryName, Long categoryId){
        return repository.findByNameAndCategoryId(subcategoryName, categoryId);
    }
}
