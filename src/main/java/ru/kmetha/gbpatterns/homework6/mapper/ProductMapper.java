package ru.kmetha.gbpatterns.homework6.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.kmetha.gbpatterns.homework6.dao.CategoryDao;
import ru.kmetha.gbpatterns.homework6.dao.ManufacturerDao;
import ru.kmetha.gbpatterns.homework6.dto.ProductDto;
import ru.kmetha.gbpatterns.homework6.entity.Manufacturer;
import ru.kmetha.gbpatterns.homework6.entity.Product;

import java.util.NoSuchElementException;

@Mapper(uses = ManufacturerMapper.class)
public interface ProductMapper {

    Product toProduct(ProductDto productDto, @Context ManufacturerDao manufacturerDao, @Context CategoryDao categoryDao);

    ProductDto toProductDto(Product product);

    default Manufacturer getManufacturer(String manufacturer, @Context ManufacturerDao manufacturerDao) {
        return manufacturerDao.findByName(manufacturer).orElseThrow(
                () -> new NoSuchElementException("There isn't manufacturer with name " + manufacturer)
        );
    }

    default String getManufacturer(Manufacturer manufacturer) {
        return manufacturer.getName();
    }
}
