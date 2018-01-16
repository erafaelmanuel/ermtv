package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
