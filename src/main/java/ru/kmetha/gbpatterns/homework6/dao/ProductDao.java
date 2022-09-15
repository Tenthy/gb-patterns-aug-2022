package ru.kmetha.gbpatterns.homework6.dao;

import ru.kmetha.gbpatterns.homework6.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    Optional<Product> findByTitle(String title);

    List<Product> findAllByTitleContaining(String title);
}
