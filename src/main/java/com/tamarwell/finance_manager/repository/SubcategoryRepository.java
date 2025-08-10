package com.tamarwell.finance_manager.repository;

import com.tamarwell.finance_manager.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
    Optional<Subcategory> findSubcategoryByName(String subcategoryName);
    Optional<Subcategory> findByNameAndCategoryId(String name, Long categoryId);
}
