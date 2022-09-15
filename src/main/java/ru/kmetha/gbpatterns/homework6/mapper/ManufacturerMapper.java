package ru.kmetha.gbpatterns.homework6.mapper;

import org.mapstruct.Mapper;
import ru.kmetha.gbpatterns.homework6.dto.ManufacturerDto;
import ru.kmetha.gbpatterns.homework6.entity.Manufacturer;

@Mapper
public interface ManufacturerMapper {

    Manufacturer toManufacturer(ManufacturerDto manufacturerDto);

    ManufacturerDto toManufacturerDto(Manufacturer manufacturer);
}
