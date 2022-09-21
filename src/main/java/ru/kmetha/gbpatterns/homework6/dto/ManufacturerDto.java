package ru.kmetha.gbpatterns.homework6.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ManufacturerDto {

    private Long id;
    @NotBlank
    private String name;
}