package com.example.bigbasket_ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bigbasket_ecom.Model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category deleteById(int id);
}
