package ru.kmetha.gbpatterns.homework6.mapper;

import org.mapstruct.Mapper;
import ru.kmetha.gbpatterns.homework6.dto.CategoryDto;
import ru.kmetha.gbpatterns.homework6.entity.Category;

@Mapper
public interface CategoryMapper {

    Category toCategory(CategoryDto categoryDto);

    CategoryDto toCategoryDto(Category category);
}
