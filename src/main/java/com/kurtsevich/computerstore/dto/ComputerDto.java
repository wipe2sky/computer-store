package com.kurtsevich.computerstore.dto;

import com.kurtsevich.computerstore.entity.enums.ComputerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ComputerDto extends BaseProductDto{
    private ComputerType computerType;

}
