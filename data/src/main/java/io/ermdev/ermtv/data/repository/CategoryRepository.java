package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Category;
import io.ermdev.ermtv.data.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("from Category where id=:categoryId")
    Category findById(@Param("categoryId") Long categoryId);

    @Query("from Category")
    List<Category> findAll();
}
