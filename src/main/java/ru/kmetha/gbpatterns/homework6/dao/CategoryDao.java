package ru.kmetha.gbpatterns.homework6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmetha.gbpatterns.homework6.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
