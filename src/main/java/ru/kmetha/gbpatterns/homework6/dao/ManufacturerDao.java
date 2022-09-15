package ru.kmetha.gbpatterns.homework6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmetha.gbpatterns.homework6.entity.Category;
import ru.kmetha.gbpatterns.homework6.entity.Manufacturer;

import java.util.Optional;

public interface ManufacturerDao extends JpaRepository<Category, Long> {

    Manufacturer findByNameLike(String name);

    Optional<Manufacturer> findByName(String name);
}
