package com.kurtsevich.computerstore.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class HddDto extends BaseProductDto {
    @Min(value = 16, message = "Capacity must be greater than 16GB")
    private Integer capacity;

}
